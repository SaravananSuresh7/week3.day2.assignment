package week3.assignments1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}

		System.out.println("Input: \t " + list);
		LinkedHashSet<Integer> orgSet = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> dupSet = new LinkedHashSet<Integer>();
		for (Integer integer : list) {
			if (!orgSet.add(integer)) {
				dupSet.add(integer);
			}
		}
		System.out.println("Duplicate integers are: \n\t " + dupSet);

	}
}
