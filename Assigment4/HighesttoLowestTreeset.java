package Assigment4;

import java.util.TreeSet;

public class HighesttoLowestTreeset {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(100);
		treeSet.add(4);
		treeSet.add(60);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(20);

		System.out.println("available numbers in treeset:"+treeSet);

		System.out.println("lowest element in treeset : " + treeSet.first());           

		System.out.println("highest element in treeste" + treeSet.last()); 
	}

}
