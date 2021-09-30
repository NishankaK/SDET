package Assignment2;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {12,32,12,45,65,93,0,23,45,6};

		System.out.println("duplicate values are:");

		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {


				if((a[i]==a[j])) {


					System.out.println(" The duplicate elements are:"+a[j]);
				}
			}
		}

	}
}
