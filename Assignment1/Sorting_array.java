package Assignment1;

import java.util.Arrays;

public class Sorting_array {

	public static void main(String[] args) {

		//elements of the array in original order
		int a[]=  {12,15,83,98,23};
		int temp=0;
		System.out.println("Elements of original array:"); 
		for (int i=0;i<a.length;i++) {
			System.out.println(""+a[i]+"");

			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("Elements of Ascending order array:");

		for(int j=0;j<a.length;j++) {


			System.out.println(""+a[j]+"");
		}}}
