package localglobalvariables;

public class StaticVariable {
      static int r;
      static double t;
	public static void main(String[] args) {
		System.out.println(StaticVariable.r);
		StaticVariable.run();
		StaticVariable.r=10;
		StaticVariable.t=22.88;
		System.out.println("*******************************");
		StaticVariable.run();
		System.out.println("program end");
	}
   static void run() {
	   
	   System.out.println(StaticVariable.r);
	   System.out.println(StaticVariable.t);
   }
}
