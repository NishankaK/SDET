package Assignment1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {

		// leap year is divisible by 4 for all the century years --- ending with 00.
		// century is leap year only when its perfectly divisible by 400.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of the year:");
		int year=scanner.nextInt();
		if (year%100==0) {
			if(year%400==0) {
				System.out.println(year+"is a leap year");

			}
			else {
				System.out.println(year+"is not a leap year");

			}
		}
		else {


			if(year%4==0) {
				System.out.println(year+"is a leap year");
			}
			else {
				System.out.println(year+"is not a leap year");
			}

		}
	}
}
