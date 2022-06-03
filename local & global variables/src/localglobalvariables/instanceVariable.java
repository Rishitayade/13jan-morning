package localglobalvariables;

public class instanceVariable {
     int age=30;
     double salary;
     boolean grade=true;
	public static void main(String[] args) {
		instanceVariable R1=new instanceVariable();
       System.out.println(R1.age);
       System.out.println(R1. salary); 
       R1.age=40;
       R1.salary=2230.4899;
       System.out.println(R1.age);
       System.out.println(R1.salary);
        
       instanceVariable x1=new instanceVariable();
       System.out.println(x1.age );
       System.out.println(x1.salary);
	}

}
