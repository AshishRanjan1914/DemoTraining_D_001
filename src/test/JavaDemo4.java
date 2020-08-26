package test;

public class JavaDemo4 {
	//non-static
	static String schoolname = "XYZ";
	String name;
	int age ;
	int rollNo;
	
	//userdefined con--
	public JavaDemo4(){
		System.out.println("I am on default constructor created by user");
	}
	
	public JavaDemo4(String naasdasdme){		
		System.out.println("I am on constructor created by user name "+ naasdasdme);
		this.name = naasdasdme;
	}
	
	public JavaDemo4(String name, int age){
		this(name);
		this.age = age;		
		System.out.println("I am on constructor created by user name "+name+" and age "+age);		
	}
	
	public JavaDemo4(String name, int age, int rollNo){
		this(name,age);
		this.rollNo = rollNo;
		System.out.println("I am on default constructor created by user name " +name + " age "+age+" rollNo "+rollNo);
		
	}
	
	public JavaDemo4(String name, int age, int rollNo,String changeSchoolName){
		//const.. chain
		this(name,age,rollNo);		
		JavaDemo4.schoolname = changeSchoolName;
		System.out.println("I am on default constructor created by user name " +name + " age "+age+" rollNo "+rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//whenever an object of class is created then the body of the cons is executed.
		JavaDemo4 student1 = new JavaDemo4();
		System.out.println(JavaDemo4.schoolname+ " "+student1.age+" "+student1.rollNo+" "+student1.name);
		
		JavaDemo4 student2 = new JavaDemo4("StuName1");
		System.out.println(JavaDemo4.schoolname+ " "+student2.age+" "+student2.rollNo+" "+student2.name);
		
		JavaDemo4 student3 = new JavaDemo4("Stuname2",12);
		System.out.println(JavaDemo4.schoolname+ " "+student3.age+" "+student3.rollNo+" "+student3.name);
		
		JavaDemo4.schoolname = "NEWXYZ";
		
		JavaDemo4 student4 = new JavaDemo4("Stuname3",14, 001);
		System.out.println(JavaDemo4.schoolname+ " "+student4.age+" "+student4.rollNo+" "+student4.name);		
		
		JavaDemo4 student5 = new JavaDemo4("Stuname5",14, 001, "NewSchoolName");
		System.out.println(JavaDemo4.schoolname+ " "+student5.age+" "+student5.rollNo+" "+student5.name);	
		
		
		char[] charrry = new char[4];
		charrry[0] = 'a';
		charrry[1] = 'b';
		charrry[2] = 'c';
		charrry[3] = 'd';
		
		System.out.println(charrry[2]);
		
		//basic looploop
		for (int i = 0; i < charrry.length; i++) {
			System.out.println("At value "+i+" "+charrry[i]);
		}
		
		//for-each
		for (char c : charrry) {
			System.out.println(c);
		}
		
		String[] st = new String[2];
		int[] intA = new int[4];
		
		
	}

}
