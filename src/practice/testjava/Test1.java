package test;

public class Test1 {
	//variables--
	//data types -- 8 
	// global and global variables .. = java default values for global variables..
	public static boolean isItAFinalChoice;
	public static String mystring = "THIS IS MY STRING.";	
	public static int i = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("START PROG.");
		boolean isItYourInitialChoice = true; //local variable
		System.out.println("isItAFinalChoice:: "+isItAFinalChoice);//global
		System.out.println("isItYourInitialChoice:: "+isItYourInitialChoice);//local- must be initialzed
		// conditional statements...// looping statements
		//1,2,3,4,5,6,7,8,9,10//2,4,6,8,10//0,1,2,3,5,8
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5); System.out.println(6);
		 * System.out.println(7); System.out.println(8); System.out.println(9);
		 * System.out.println(10);
		 */
		
		//conditions
		String s = "Sunday";
		int ii = 1;
		if(ii==1) {
			System.out.println("JAN");
		} else {
			System.out.println("I DONT KNOW");
		}
		
		if(i == 1) {
			System.out.println("JAN");
		} else if (i == 2){
			System.out.println("FEB");
		} else if (i == 3) {
			System.out.println("MARCH");
		} else {
			System.out.println("THIS IS INVALID Month INPUT");
		}
		
		//switch case statements..		
		//for loop... while...
		System.out.println("STARTING LOOP");//1,3,5,7
		System.out.println("TABLE OF 2");		
		//even and odd...
		  for(int a=2; a<=100; a++) { 
			  if(a%2==0) {// num is completely divisible by 2
				  //System.out.println(a); 
				  } else {
					 // System.out.println("I am odd number"+a);
				  }
			  }		 
		System.out.println("TABLE OF 5");
		for(int i = 1; i <= 10; ++i)
        {            
            if(i == 5) {
            	System.out.println("HAPPY BIRTHDAY");
            	continue;
            	
            }
            System.out.println(5 * i);
        }
		System.out.println("FAB SERIES");
		int n=10, a=0, b=1;
		for (int i=1; i<8; ++i)
		{
	      System.out.print(a+", ");
	      int c=a+b;
	      a=b;
	      b=c;
	    }

		
		//swap variable values..
		int p = 10;
		int q = 20;
		int temp=p;
		p=q;
		q=temp;
		System.out.println(p);
		System.out.println(q);
		System.out.println("*****************************");
		for (int i = 1; i < 30; i++) {
			
			int result = 11*i;
			if(result == 121) {
				continue;				
			}
			
			if (result >= 250) {
				break;
			}
			System.out.println(result);
			
			
		}
		System.out.println("*****************************");




		System.out.println("*****");

	}
	

}
