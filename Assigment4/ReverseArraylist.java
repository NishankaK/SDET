package Assigment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> hs = new ArrayList<String>();  
		hs.add("Dog");  
		hs.add("Cat");  
		hs.add("Horse");  
		hs.add("Cow");  
		System.out.println("Before Reversing");  
		System.out.println(hs.toString());  

		Collections.reverse(hs);  
		System.out.println("After Reversing");  
		System.out.println(hs);  
	}

}
