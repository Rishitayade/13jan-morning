package localglobalvariables;

public class globalvariables {
           static int age=25;
             static boolean A;
          double B;
	public static void main(String[] args) {
	 	   System.out.println("program  start  ");
		  System.out.println("ststic global variables:    "+age);
		   System.out.println("SGV        "   +  globalvariables.age);
		   System.out.println("blood group   "+A);
			 age=30;
			 globalvariables x1=new globalvariables();
			  x1.B=77.88;

			 System.out.println("ststic global variables:      "+  age);
			 System.out.println("SGV     " +globalvariables.age);
			 System.out.println("**********************");
			 System.out.println(A);
	    	int	age=35;
	     	 System.out.println("ststic global variables:          "+  age);
	     	System.out.println("SGV     "+globalvariables.age); 
	     	System.out.println("the value is: "+x1.B);
	      	

	}

}
