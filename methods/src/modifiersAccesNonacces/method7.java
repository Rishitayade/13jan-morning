package modifiersAccesNonacces;

public class method7 {

	public static void main(String[] args) {
     System.out.println("sum: "+add());
     System.out.println("sum 1  :"+add(40,50));
     System.out.println("sum2: "+add(50,60,40.7));
      
     
	}
   static int add() {
	   int num1=30, num2= 47;
	   return num1+num2;
   }
   static double add(int num1,int num2) {
	int sum=num1+num2;
	return sum;
   }
   static double add(int num1, int num2, double num3) {
	    double sum=num1+num2+num3;
	    return sum;
   }
}
