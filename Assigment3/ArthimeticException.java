package Assigment3;

public class ArthimeticException {
	
	void method() throws ArithmeticException {
			throw new ArithmeticException("ArithmeticException Occurred");
		}

		public static void main(String[] args) {

			ArthimeticException obj = new ArthimeticException();
			obj.method();
			System.out.println("handle Arthimetic Exception ");

		}

	}
