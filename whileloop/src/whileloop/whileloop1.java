package whileloop;

public class whileloop1 {

	public static void main(String[] args) {
      char ch='A';
      while(ch<='Z') {
    	  System.out.print(ch+ "  ");
    	  ch++;
      }
      System.out.println("********************reverce number***************");
      char ch1='Z';
  	while (ch1>='A') {
		System.out.print(ch1+ "  ");
		ch1--;
	} 
  	System.out.println("***********************small letter************");
  	char ch2='a';
  	while (ch2<= 'z') {
  		System.out.print(ch2+"  "); 
  		ch2++;
  		
  	}
	}
}


