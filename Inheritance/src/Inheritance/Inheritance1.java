package Inheritance;
 class P{
	 static char a='D';
	 int b=20;
	 float c= 20.2f;
 }
 class Q extends  P{
	 static char p='k';
	 int q=30;
	 double r= 30.30;
 }
 class R extends Q{
	 static char x='Z';
	 int y=40;
	 float z=40.40f;
 }
public class Inheritance1 {
 
	public static void main(String[] args) {
        
		System.out.println(P.a);
		System.out.println(Q.p);
		System.out.println(R.x);
		System.out.println("********************************************************************************");
		R a1= new R();
	    System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.q);
		System.out.println(a1.r);
		System.out.println(a1.y);
		System.out.println(a1.z);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Q a2=new Q();
		System.out.println(a2.b);
		System.out.println(a2.c);
		System.out.println(a2.q);
		System.out.println(a2.r);
	
	}

}
