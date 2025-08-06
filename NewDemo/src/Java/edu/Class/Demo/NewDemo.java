package Java.edu.Class.Demo;

public class NewDemo {

	public static void main(String[] args) {
		        System.out.println("StaticVarDemo.staticVar = " + StaticVarDemo.staticVar);

		        StaticVarDemo a1 = new StaticVarDemo();
		        StaticVarDemo a2 = new StaticVarDemo();

		        System.out.println("a1.instanceVar = " + a1.instanceVar);
		        System.out.println("a2.instanceVar = " + a2.instanceVar);

		        System.out.println("a1.staticVar = " + a1.staticVar);
		        System.out.println("a2.staticVar = " + a2.staticVar);

		        a1.instanceVar++;
		        a1.staticVar++;

		        System.out.println("After modifying a1...");
		        System.out.println("a1.instanceVar = " + a1.instanceVar);
		        System.out.println("a1.staticVar = " + a1.staticVar);

		        System.out.println("a2.instanceVar = " + a2.instanceVar);
		        System.out.println("a2.staticVar = " + a2.staticVar);
		    }
	}


