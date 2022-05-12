package modifiersAccesNonacces;

public class method5 {

	public static void main(String[] args) {

		method5 x1=new method5();
		x1.interest(555000,5.5,50);
		System.out.println("get interest: "+x1.interest1(500, 6.6, 40));
		double result=x1.interest1(3000, 4, 55);
		System.out.println("the interest is :  "+result);
		double res=x1.interest2(8888, 4.5, 32);
		System.out.println("interest : "+res); 
		System.out.println("the interest: "+x1.interest2(500, 9.0, 21));
	}
  public void interest(int p, double r, int t) {
	  double res=(p*r*t)/100;
	  System.out.println(res);
  }
  private double interest1(int p, double r, int t) {
	  double res=(p*r*t)/100;
	  return res;
  }
  double interest2(int p, double r, int t) {
	  double res=(p*r*t)/100;
	  return res;


  }
}
