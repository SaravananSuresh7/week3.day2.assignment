package week3.assignments1;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week 1";
		int count = 0;
		String[] array = text.split(" ");
		ArrayList<String> Original = new ArrayList<String>();
		ArrayList<String> Duplicate = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			Original.add(array[i]);
			Duplicate.add(array[i]);
		}
		for (String string : Duplicate) {
			if (string.equals("java")) {
				count++;
			}
			if (count >= 1) {
				Original.remove("java");
			}
		}
		System.out.println(Original);
	}
}
