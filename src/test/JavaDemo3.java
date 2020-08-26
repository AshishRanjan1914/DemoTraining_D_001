package test;


public class JavaDemo3 {	
	//Access modifier(public/default/protected/private) - static/non-static returnType nameOfMethod(Methods args ...){}

	
	//Method - overloading..
	private void add() {
		System.out.println(10+20);
	}
	
	public static int add(int i) {
		return 10+i;
	}
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public double add(double i, double j) {
		return i+j;
	}
	
	public double add(float i, float j) {
		return i+j;
	}
	
	public String returnDayName(String chars) {
		//s == (assignment) / comparison
		String result;
		
		if (chars.equalsIgnoreCase("S")) {
			result =  "Sunday";
		} else if (chars.equalsIgnoreCase("M")){
			result =  "Monday";
		} else if (chars.equalsIgnoreCase("W")){
			result = "Wednesssday";
		} else {
			result = "Friday";
		}
		
		return result;
	}
	
	public void printTable(int i) {		
		//loops
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		System.out.println(2*10);	
		
		for (int j = 1; j <= 10; j++) { 
			int res = j*i;
			
			if(res == 20) {
				System.out.println("java,");
				//break;
				continue;
			}
			
			System.out.println(res);
		}
		
		System.out.println(" using while");
		int k = 1;
		while (k <= 10) {
			System.out.println(k*i);
			//k = k+1;
			k++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaDemo3 JavaDemo3 = new JavaDemo3();
		System.out.println(JavaDemo3.add(10, 4));
		int res1 = JavaDemo3.add(10, 4);
		System.out.println(res1);
		
		
		//conditional statements--
		String res12 = JavaDemo3.returnDayName("s");
		System.out.println(res12);
		
		JavaDemo3.printTable(4);
		
	}
	
	
	
	
	
}
