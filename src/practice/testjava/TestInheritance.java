package test;

class TestInheritance {

	public static void main(String[] args) {
		System.out.println("PROG STARTS"); // prog starts
		Father ram = new Father("Ram", 40, "Setor 40, noida, 201301"); // ---
		Father.homeName = "Jannat"; //-- 
		System.out.println("Father.homeName :: "+Father.homeName); // jannat
		System.out.println("Name is:: "+ram.name+ " AND Age is :: "+ ram.age+ " AND Address is :: "+ram.address); // ram/40/sector 40
		ram.walk(); // Father ram is walking.
		ram.talk(); // Father ram is talking.
		ram.farming(); // family ram is farming.

		Son ramsi = new Son("Ramshi", 10, "Setor 40, noida, 201301"); // -- 
		Son.homeName = "Kinara"; // --
		System.out.println("Son.homeName :: "+Son.homeName); // Kinara
		System.out.println("Name is:: "+ramsi.name+ " AND Age is :: "+ ramsi.age+ " AND Address is :: "+ramsi.address);//Ramshi/10/sector 40
		ramsi.walk(); // Son ramshi is walking in the fancy style
		ramsi.talk(); // Father Ramshi is talking.
		ramsi.farming(); // Family Ramshi is farming.
		ramsi.doingBussiness(); // Son Ramshi is doing bussiness
		ramsi.whisle();
		
		// Inh-- object cast ---
		
		Father ramesh = new Son("ramesh", 25, "Juhu"); // Inheritence
		
		
		ramesh.walk();
		ramesh.talk();
		ramesh.farming();
		//ramesh.doingBussiness(); -- error
		//ramesh.whisle();// error..
	}	

}

class Father {
	
	public Father() {
		// TODO Auto-generated constructor stub
	}

	static String homeName;
	String name;
	int age;
	String address;	
	public Father(String name,int age,String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.address = address;
	}	

	void walk() {//
		System.out.println("Father "+this.name+" is walking.");
	}

	void talk() {
		System.out.println("Father "+this.name +" is talking.");
	}

	void farming() {
		System.out.println("Family "+this.name +" is farming.");
	}

}

class Son extends Father{ // Inheritance..
	
	public Son() {
		
	}

	public Son(String name, int age, String Address) {
		
		super(name, age, Address); // this(same class) -- super(parent class)
		
		
		// TODO Auto-generated constructor stub
	}	

	void doingBussiness() {
		System.out.println("Son "+this.name +" is doing bussiness.");
	}
	
	@Override
	void walk() {//
		System.out.println("Son "+this.name+" is walking in the fancy style.");
	}
	
	void talk() {
		System.out.println("Son "+this.name +" is talking in sharukh khan style.");
	}
	
	void whisle() {
		System.out.println("Son "+this.name +" is whisle.");
	}
	

}
