package Inheritance;

public class Inheritance5 {
class A2 {
			void msg() {
				System.out.println("Hello");
			}
		}
		class B2 {
			void msg() {
				System.out.println("Welcome");
			}
		}
		class Inheritance5 extends A2,B2{
			
			Inheritance5(){
				super();//confusion 
			}

			public static void main(String args[]) {
				Inheritance5 obj = new Inheritance5();
				obj.msg();
			}
		}
		/**
		is java supports multiple inheritnace or not?
		why java doesn't support multiple inheritance using classes?
		*/
	}


