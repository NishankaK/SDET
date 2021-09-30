package Assigment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {


	public static void main(String[] args) {

		String str = " Duplicate characters with their occurrences count";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (char value : arr) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);

	}

}
