package modifiersAccesNonacces;

class adder{
	static int add(int a,int b) {
		return a+b;
	} 
	static int add (int a, int b, int c) {
		return a+b+c;
	}
}
public class method9{
	static  void display () {
		System.out.println("i am display of method classs");
	}
	public static void main (String []args) {
		//method9 a1=new method9();
		
		display();
		System.out.println(adder.add(50, 60));
		System.out.println(adder.add(60, 50,40));
	}
 
	 
 











		
	}


