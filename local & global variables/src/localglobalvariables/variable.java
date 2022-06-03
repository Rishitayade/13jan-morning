package localglobalvariables;

public class variable {
          double salary;       //instance variable
          static int age=24;  //static variable
          static char grade;
          int empid=1997; 
	public static void main(String[] args) {
		    long mobileNo=70204622;
		    variable ref2=new variable();
		    System.out.println("Age :    "    + variable.age );
		    System.out.println("salary of emp:   " + ref2.salary);
		    System.out.println("grade in exam:   " +variable.grade   ) ;
		    System.out.println("empid :   "+  ref2.empid);
		ref2.salary=7777.80;
		     System.out.println("salary    "+ ref2.salary );
		 age=30;
		 System.out.println("standurd age     "+   variable.age); 
		 System.out.println("in exam   "+ variable.grade);
		 System.out.println("mob no   "+mobileNo);
	}

}
