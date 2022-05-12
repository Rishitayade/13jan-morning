package modifiersAccesNonacces;

public class method4 {

	public static void main(String[] args) {
		System.out.println(method4.getinterest(2000,6.5,30));
		method4.getinterst1(4000, 5.5  , 40);
		System.out.println("interest2:"+method4.getinterest2(58888, 2.4,32));
		double res=method4.getinterest2(5777, 2.4,28);
		System.out.println("intereast   :"+res);//another method to declear returntype
	}
  public static double getinterest(int p, double r, int t) {
	  return (p*r*t)/100;
  }
  public static double getinterest2(int p, double r, int t) {
	  double res=(p*r*t)/100;
	  return res;
	  }
   public static void getinterst1(int p, double r, int t) {
	  double res=(p*r*t)/100;
	  System.out.println("the interest:  "+res);
  }
}
