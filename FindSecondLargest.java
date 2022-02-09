package week3.assignments1;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {
	public static void main(String[] args) {
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(3);
		Array.add(2);
		Array.add(11);
		Array.add(4);
		Array.add(6);
		Array.add(7);
		System.out.println("Data:" + Array);
		Collections.sort(Array);
		System.out.println("Sorted Data:" + Array);
		int i = Array.size();
		int j = i - 2;
		System.out.println(Array.get(j));

	}

}
