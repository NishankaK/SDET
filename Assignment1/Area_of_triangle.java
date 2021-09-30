package Assignment1;

import java.util.Scanner;

public class Area_of_triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base=0;
		int height=0;
		int area=0;

		System.out.println("Enter the base of triangle:");
		base = scanner.nextInt();

		System.out.println("Enter the height of triangle");
		height = scanner.nextInt();

		area=(base*height)/2;

		System.out.println("The area of triangle is :"+area);

	}
}
