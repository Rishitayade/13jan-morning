package Inheritance;
class A1{
	  static int a=22;
	  int b=20;
	  double c=12.22; 
}
class B1 extends A1{
	static int x=30;
	int y=40;
	double z=50.50;
}
class C1 extends B1{
	static int p=60;
	int q=70;
	double r=80.10;
}
public class inheritance {	
	public static void main(String[] args) {
		  
	System.out.println("class A1 static variable:"+A1.a);	
	System.out.println("class B1 static variable:"+B1.x);
	System.out.println("class C1 static variable:"+C1.p);
	
	System.out.println("************************************");
	C1 a1=new C1();//it will have non static member of the class A1,B1,C1---->>

	System.out.println("with class ref:"+a1.b);
	System.out.println("with class ref:"+a1.c);
	System.out.println("with class ref:"+a1.y);
	System.out.println("with class ref:"+a1.z);
	System.out.println("with class ref:"+a1.q);
	System.out.println("with class ref:"+a1.r);
	}  
  
		

}
