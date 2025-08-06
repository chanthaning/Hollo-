package Java.Demo.PIP;

public class HifromDemo {

    public static void main(String[] args) {
        System.out.println("MyClass.staticVar = "+ StaticVarDemo.staticVar);

        StaticVarDemo a1 = new StaticVarDemo();
        StaticVarDemo a2 = new StaticVarDemo();

        System.out.println("a1.instanceVar = " + a1.instanceVar); // 1
        System.out.println("a2.instanceVar = " + a2.instanceVar); // 1
        System.out.println("a1.staticVar = " + a1.staticVar);     // 1
        System.out.println("a2.staticVar = " + a2.staticVar);     // 1

        a1.instanceVar++;
        a1.staticVar++;

        System.out.println("a1.instanceVar = " + a1.instanceVar); // 2
        System.out.println("a1.staticVar = " + a1.staticVar);     // 2
        System.out.println("a2.instanceVar = " + a2.instanceVar); // 1 (unchanged)
        System.out.println("a2.staticVar = " + a2.staticVar);     // 2 (shared)
    }
}
