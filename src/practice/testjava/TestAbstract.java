package test;

abstract class Animal{
	
	//abstract method
	abstract void run();
	//100 %- not abstract..
	//non-abstract
	void sleep() {
		System.out.println("SLEEPING");
	}
}

class Cow extends Animal{
	
	//abstract - overriding
	void run() {
		System.out.println("COW is running");
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cow cow1 = new Cow();
		cow1.run();
		
		
		//Animal a1 = new Animal();// you can't create an object of a abstact class.

	}

}
