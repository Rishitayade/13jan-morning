package modifiersAccesNonacces;

public class method3 {

	public static void main(String[] args) {
           /*  
            * si=p*r*t
            * 
            */
	  System.out.println(method3.simpleInterest(5000,  6.7, 60  )   );
	  method3.simpleInterest2(3000,7.7,33);
		double result=method3.simpleInterest(67777,  7.8 ,36);
		System.out.println( "get interest    :"+      result);
		
		}
    public static double simpleInterest(int p, double r, int t) {
    	double result=  (p*r*t)/100;
    	return result;
    }
    public static void simpleInterest2(int p, double r, int t) {
       double sum=  (p*r*t)/100;
    	System.out.println("result     "+sum);
    }
}
