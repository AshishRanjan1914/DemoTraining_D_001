package test;

public class Boy {

	//global variables..
	String name;
	int age;
	double monthlyExpense;

	//default cons...
	// constructor overloading .... 
	//this .....
	public Boy() {
		// TODO Auto-generated constructor stub
		System.out.println("I am creating a Boy object");		
	}

	//this
	public Boy(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("I am creating a Boy object"+ name);		
		this.name = name;// int i = 10;		
	}

	public Boy(String name, int age) {
		// TODO Auto-generated constructor stub
		//this.name = name;
		this(name); // constructor -- cons -chaning
		this.age= age;
		System.out.println("I am creating a Boy object"+ name + age);
	}

	public Boy(String name, int age, double monthlyExpense) {
		// TODO Auto-generated constructor stub
		
		//this.name = name;
		//this.age= age;
		this(name,age);
		this.monthlyExpense= monthlyExpense;
		System.out.println("I am creating a Boy object"+ name + age+monthlyExpense);
	}

	public void dance() {
		//local variable
		int iAmLocal = 1;
		System.out.println("Boy is dancing");
		return ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub...
		System.out.println("PROG STARTS");		
		Boy boy1 = new Boy(); //object /instance --- create		
		System.out.println("Boy1= "+boy1.name); // null
		System.out.println("Boy1= "+boy1.age); // 0
		System.out.println("Boy1= "+boy1.monthlyExpense); //0.0		

		Boy boy2 =new Boy("FirstBoy");
		System.out.println("Boy2= "+ boy2.name);//FirstBoy
		System.out.println("Boy2= "+boy2.age); // 0
		System.out.println("Boy2= "+boy2.monthlyExpense); // 0.0

		Boy boy3 =new Boy("SecondBoy", 12);
		System.out.println("boy3= "+ boy3.name); // SecondBoy
		System.out.println("boy3= "+boy3.age); // 12
		System.out.println("boy3= "+boy3.monthlyExpense); // 0.0

		Boy boy4 =new Boy("ThirdBoy", 12, 1.1);
		System.out.println("boy4= "+ boy4.name);//ThirdBoy
		System.out.println("boy4= "+boy4.age);//12
		System.out.println("boy4= "+boy4.monthlyExpense);//1.1
		System.out.println("PROG ENDS");

		//type cast .args.clone().



	}

}
