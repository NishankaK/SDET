package Assignment1;
import java.util.Scanner;
public class Reverse_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the elements into the array");
		
		for (int i=0;i<num;i++) {
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("printing the reverse elements in the array");
		
          for(int i=a.length-1;i>=0;i--) {
	      System.out.println(a[i]);
}
}
}
