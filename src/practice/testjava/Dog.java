package test;

public class Dog {
	// scope --
	///properties of class	
	
	static byte b; //0
	static short s;	//0
	static int i;//0
	static long l;//0
	static double d;//0.0
	static float f;//0.0	
	static char c;		//
	static boolean bol;// false
	
	
	//method == functions of the class
	//entry point..
	public static void main(String[] args) {
		//local
		int j=0;
		System.out.println(j);
		
		System.out.println("**************Hello, Java!**********");
				
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c);
		System.out.println(bol);	
		
	}
	
}
