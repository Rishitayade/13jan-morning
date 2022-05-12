package modifiersAccesNonacces;

public class staticmodifiers {

	public static void main(String[] args) {
		printDetails(50000,24);
		printDetails(68000,30);
		printDetails(88000,22); 
	}
 static void printDetails(int salary,int age) {
	 System.out.println("my expected salary:  "+salary );
	 System.out.println("my age is:  "+  age);
 }
}
