package test;

public class JavaDemo2 {
	//Members of class -
	//Global Varibales
	
	// 8 - primitive data types.
	//global -
	static char c;
	int ii;
	static int i;
	static double d;
	static boolean b;
	static float f;	
	static long l;
	static short s;
	static byte by;
	
	// methods - return - 
	//Access modifier(public/default/protected/private) - static/non-static returnType nameOfMethod(Methods args ...){}
	public static void printIndia() {
		System.out.println("India !!");
	}
	
	public void printHindustan() {
		int j=0;
		System.out.println(j);
		System.out.println("Hindustan !!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//default values for global variables
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(b);
		
		//System.out.println(ii);
		
		JavaDemo2 javaDemo2 = new JavaDemo2();
		JavaDemo2 javaDemo21 = new JavaDemo2();
		JavaDemo2 javaDemo22 = new JavaDemo2();
		
		//static--
		System.out.println(JavaDemo2.i); //0
		JavaDemo2.printIndia();
		JavaDemo2.i = 10;
		System.out.println(JavaDemo2.i); //10
		JavaDemo2.i = 20;
		System.out.println(JavaDemo2.i); //20
		
		//Non-static - object/instance
		System.out.println(javaDemo2.ii); //0 - default
		javaDemo2.printHindustan();
		javaDemo2.ii = 100;
		System.out.println(javaDemo2.ii); // 100
		javaDemo21.ii = 200;
		System.out.println(javaDemo21.ii); //200
		
		/*	
		 * //println - prints first, Cursor to next line
		//print - prints first,Cursor to same line
		System.out.print("Hi");
		System.out.println("Good");
		System.out.println("morning");
		System.out.print("How are you");
		System.out.print("I am good");
		System.out.println("How about you?");
		System.out.println("I am also fine!");
		*/
	}

}
