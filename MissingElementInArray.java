package week3.assignments1;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		int j = 1;
		Set<Integer> Array = new TreeSet<Integer>();
		Array.add(1);
		Array.add(2);
		Array.add(3);
		Array.add(4);
		Array.add(7);
		Array.add(6);
		Array.add(8);
		System.out.println("Array:" +Array);
		for (int i = 0; i < arr.length; i++) {
			if(j!=arr[i]) {
				System.out.println(j);
				break;
			}
			j++;
		}
			
		
	}

}
