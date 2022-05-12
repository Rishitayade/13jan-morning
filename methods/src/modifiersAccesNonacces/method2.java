package modifiersAccesNonacces;

public class method2 {

	public static void main(String[] args) {
	double sum= Addition(45  ,88); 
	           System.out.println("Addition is :  "+sum);
	          sum= Addition(58  ,88); 
	           System.out.println("Addition is :  "+sum);
	            sum= Addition(42  ,88); 
	           System.out.println("Addition is :  "+sum);
               method2.Addition2(55  ,66);
               method2.Addition2(50  ,10);
            System.out.println(Addition (55,  45));
            System.out.println( method2.Addition(44,66));
          double res=  method2.Addition(44,66);
           sum=res/100;
            System.out.println("total value  "+sum);
	}
     static double Addition (int num1,double num2) {
	double result =num1+num2;
	 return result;

}
     static void  Addition2 (double num1,double num2) {
    		double result =num1+num2;
    		System.out.println("Addition result  "+result); 
    		
     }  
}