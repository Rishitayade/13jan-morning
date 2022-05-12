package modifiersAccesNonacces;

public class method6 {

	public static void main(String[] args) {
      
		method6 R1=new method6();
		R1.addition(20, 30, 40);
		System.out.println("the result:  "+R1.addition1(40,50,60));//2 type to declear
		double res=R1.addition1(70,60,50);
		System.out.println("additoin  :"+res);
	}
    void addition(int num1,int num2,long num3) {
    	long result=(num1+num2+num3); 
    	System.out.println("the addition is : "+result);
    }
    private double addition1(int num1,int num2,long num3) {
    	double res=(num1+num2+num3);
    	return res;
    }
}
