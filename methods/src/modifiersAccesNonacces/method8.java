package modifiersAccesNonacces;

public class method8 {

	public static void main(String[] args) {
		method8 q1=new method8();
		q1.square(22);
		q1.square(10,2);
		q1.square(10,20,30);
	}
    public void square() {
	 System.out.println("hello");
  }
  public void square(int num) {
	  int square =num * num;
	  System.out.println(square);
  }
  public void square(int num1,int num2) {
	  int square =num1*num1/num2; 
	  System.out.println("the square is: "+square);
  }
   void square (int num1,int num2,int num3) {
	int sum=num1*num2/num3;
	System.out.println(sum);
  }
}
