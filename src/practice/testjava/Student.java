package test;

public class Student {
	//non-static 
	String name;
	String Address;
	int age;
	int rollnumber;
	int mathmarks;
	int englishMarks;
	
	static String classStd;
	static String schoolName;
	//member - --variable+Method
	//non static ---variable.
	
	public static int returnMyAddress() {
		return 0;
	}
	
	
//static -- classname.
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student s1 = new Student();//constructor..
		
		System.out.println("START");//log4j
		int i = Student.returnMyAddress();

		
		s1.age = 10;
		s1.name = "rohan";
		s1.rollnumber = 1;//referenceVariable.membername
		
		Student.classStd = "";//ClassName.staticmember
		
		String mystring = "I AM an Indian.";
		
		//upper/lower
		
		//re-use
		String uppercasse = mystring.toUpperCase();		
		String lowercase = uppercasse.toLowerCase();
		
		
		System.out.println(mystring.toUpperCase().toLowerCase());
		
		
		System.out.println(uppercasse);
		System.out.println(lowercase);
		
		
		
		
	}

}
