package Assigment4;

import java.util.ArrayList;
import java.util.Collections;

public class ListofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Tiger");
		list.add("Lion");
		list.add("Cat");
		list.add("Cow");
		list.add("Mouse");
		list.add("Giraffee");
		list.add("Deer");
		System.out.println("Before Sorting: " + list);
		Collections.sort(list);
		System.out.println("After Sorting: " + list);

	}
}
