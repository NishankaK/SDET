package Assigment3;

public class PalindromeString {

	public static void main(String[] args) {

		String s="trurt";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
		System.out.println("trurt:is palindrome string");
	}
		else {
			System.out.println("trurt: is not a palindrome string");
		}	
		
		
	}

}
