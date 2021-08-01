package test;

public class Bird {

	//static vs non-static
	static int i = 20;
	static String name = "Java";
	//non-static
	int j = 10;
	String topic = "automation";  

	//methods must return..
	//static
	public static String weekName(int i) {
		//scope of the method..
		String result = "NA";
		if(i == 1) {
			result = "SUNDAY";			
		} else if (i == 2) {
			result = "TUES";
		} else if (i == 3) {
			result = "WED";			
		} else if (i == 4) {
			result = "THUS";
		} else if (i == 5) {
			result = "FRI";
		} else if (i == 6) {
			result = "SAT";
		} else {
			result = "INVALID INPUT";
		}
		//System.out.println(result);

		return result;
	}
	public static int add(int i, int j) {
		int result = i +j;
		return result;
	}
	//non-static
	public int sub(int i, int j) {
		int result = i -j;
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PROG STARTS");
		
		//object/instance of class--- 
		// you create an instance of a class, then , all the non static members of class gets loaded into it.
		Bird b1 = new Bird();// non static members - instance variable..
		System.out.println(b1.j);
		System.out.println(b1.sub(30, 20));
		b1.j = 50;
		System.out.println(b1.j);
		Bird b2 = new Bird();
		System.out.println(b2.j);
		System.out.println(b2.sub(30, 20));
		
		
		System.out.println("value of i"+Bird.i);
		i = 80;
		
		System.out.println("value of i"+i);
		
		String day = Bird.weekName(2);
		System.out.println(day);		
		Bird.weekName(6);
		Bird.weekName(8);

		//best/// always use Classname.staticmember
		int myresult = Bird.add(10, 20);
		System.out.println(myresult);
		System.out.println("PROG ENDS");				
	}


}
