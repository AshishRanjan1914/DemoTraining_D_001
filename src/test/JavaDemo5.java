package test;


class Father{
	int age;
	String name;
	
	
	public Father() {
		
	}
	
	public Father(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void walk() {
		System.out.println("Father is walking");
	}
	
	public void talk() {
		System.out.println("Father is talking");
	}
	
	public static void read() {
		System.out.println("Father is readinging");
	}
}


class Child extends Father{//IS-A
	//int age;
	//String name;
	
	public Child() {
		
	}
	
	public Child(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void dance() {
		System.out.println("Child is danceing");
	}
	
	@Override
	public void walk() {
		System.out.println("Child is walking");
	}
	
	@Override
	public void talk() {
		System.out.println("Child is talking");
	}
	//static--
	public static void read() {
		System.out.println("Child is readinging");
	}
}


public class JavaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f1 = new Father(55,"Father1");
		System.out.println("Age "+f1.age+" name "+f1.name);
		f1.talk();
		f1.walk();
		Father.read();
		
		
		Child c1 = new Child(25,"Child1");
		System.out.println("Age "+c1.age+" name "+c1.name);
		c1.dance();
		
		Child c2 = new Child();
		System.out.println("Age "+c2.age+" name "+c2.name);
		
		c2.dance();
		c2.talk();
		c2.walk();
		Child.read();//static method ..
		
		// Type -casting objects .. 
		
		
		Father c3 = new Child();
		//c3.dance(); // chaild's specific
		c3.talk(); // father's method
		c3.walk(); //father's method
		Child.read();//static method ..

	}

}
