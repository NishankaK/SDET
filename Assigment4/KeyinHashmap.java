package Assigment4;

import java.util.HashMap;

public class KeyinHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Dog");
		hashmap.put(2, "Cat");
		hashmap.put(3, "Horse");
		hashmap.put(4, "Tiger");
		hashmap.put(5, "Lion");

		boolean flag = hashmap.containsKey(2);
		System.out.println("Key 2 exists in HashMap? : " + flag);

		boolean flag2 = hashmap.containsKey(5);
		System.out.println("Key 55 exists in HashMap? : " + flag2);

		boolean flag3 = hashmap.containsKey(22);
		System.out.println("Key 99 exists in HashMap? : " + flag3);
	}
}
