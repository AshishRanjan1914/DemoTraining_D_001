package test;

public class NewClassTest {
	//properties of object ori.... polymorphism...
	
	// method overloading..---- overriding..
	public static int add() {
		int result = 10+20;
		System.out.println(result);
		return result;
	}
	
	public static int add(int i) {
		int result = 10+i;
		System.out.println(result);
		return result;
	}
	
	public static int add(int i, int j) {
		int result = i+j;
		System.out.println(result);
		return result;
	}
	
	public static double add(double i, double j) {
		double result = i+j;
		System.out.println(result);
		return result;
	}
		
	public static void main(String[] args) {
		// logging... println / print
		
		System.out.println("PROG STARTS");
		NewClassTest.add(); // return 30
		NewClassTest.add(50); // 60
		NewClassTest.add(20, 80); // 100
		NewClassTest.add(20.0, 80.0); // double
		
		
		
		String s1 = "Java";
		String s2 = "Hello";
		String s4 = "   ";
		String s3 = s2+s4+s1;
		
		String s5 = "Hello"+" "+"Java.";
		
		System.out.println(s3);
		System.out.println("My result is -"+ s5);
				
		System.out.println("*************");
		System.out.println("Hello,");
		System.out.print("Good morning.");
		System.out.print("How are you?");
		System.out.println("I am good!");
		System.out.println("How about you.?");
		System.out.print("Doing better.");
		System.out.println("See you latter.");
		System.out.println("Bye!! BYE !!");
		System.out.print("**************");
		
		System.out.println("dsfsfsdf");
		
	
					
	}
	
}

