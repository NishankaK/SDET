package Assignment2;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=1234;
		int	sum=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			sum=sum+remainder;
			number=number/10;

		}

		System.out.println("sum of digits of number 1234 is"+ sum);

	}
}
