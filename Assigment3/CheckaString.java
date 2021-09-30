package Assigment3;

public class CheckaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "A brown fox ran away fast ";

		int word = S.indexOf("brown");
		if (word == -1) {
			System.out.println("brown not found");

		} else {
			System.out.println("found brown at word" + word);

		}

	}

}
