package Assigment3;

public class ConversionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Nishanka";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);

		}
		for (char c : ch) {
			System.out.println(c);
		}

		char s[] = { 'N', 'i', 's', 'h', 'a', 'n', 'k', 'a' };
		String str1 = String.valueOf(s);
		System.out.println(s);

	}

}
