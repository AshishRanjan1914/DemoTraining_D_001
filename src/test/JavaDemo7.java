package test;

//abstract class

abstract class Player{
	
	public Player(){
		System.out.println("Player");
	}
	
	
	//not 100% abstraction ..
	//non-abstract
	public void m1() {
		System.out.println("Method Body!");
	}
	//abstract
	public abstract void batting();
}

class Sachine extends Player{
	//non-abstract
	public void m3() {
		System.out.println("M3 Method Body!");
	}

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		System.out.println("Sachine is batting!");		
	}

}

class Virat  extends Player{
	//non-abstract
	public void m3() {
		System.out.println("M3 Method Body!");
	}

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		System.out.println("Virat is batting!");
		
	}

}

public abstract class JavaDemo7 {	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new  Player();
		
		//new Sachine();



	}

}
