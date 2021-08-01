package test;


public class Traingle {	
	//properties--

	//global variables -- there is default values for them.
	public static double base ;
	public static double length;
	public static double hypo;		
	//accessModifier(public/private/protected/defaut) statis/non-static returnType nameOfTheMethod(args.....) {
	//scope of the method ...
	//	return returnType;
	//}	
	//members --- 
	public static void areaOfTraingle() {

	}	
	//add 	
	public static void addInteger() {
		//local
		double newResult = base+length;


		//declartion == exa -- int i;
		//initialization --- int j = 1;
		//local variables must be initialized before being used.
		int i = 0;
		int j = 1;		
		int result = i+j;
		System.out.println("My result is"+ result);	
	}	


	public static void subs() {

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");		
		Traingle.addInteger();	
		Traingle.multi();
		Traingle.subs();
		System.out.println("END");
	}

	public static void multi() {

	}



}
