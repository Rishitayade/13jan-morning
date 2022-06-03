package localglobalvariables;

public class globalstaticvariable {
         int age=30;    
         
	public static void main(String[] args) {
		
		globalstaticvariable g1=new globalstaticvariable();
		int age=40;
		globalstaticvariable g2=new globalstaticvariable();
		System.out.println(g1.age);
		System.out.println("hello java");
		System.out.println(g2.age);
		g2.age=50;
		System.out.println(g2.age);
		globalstaticvariable g3=new globalstaticvariable();
       System.out.println(g3.age);
	}

}
