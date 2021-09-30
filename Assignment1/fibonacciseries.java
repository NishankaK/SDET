package Assignment1;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 1;
		int n = 10;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n1 + "");
			int fib = n1 + n2;
			n1 = n2;
			n2 = fib;
		}

	}
}
