package com;

public class GenericMethod {

	public static <T> int count(T[] array, T item) {
		int count = 0;

		if (item == null) {
			for (T element : array) {
				if (element == null)
					count++;
			}
		} else {
			for (T element : array) {
				if (item.equals(element)) {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		/*Integer[] integers = { 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0 };
		int count = count(integers, 0);
		System.out.println("#occurrences of zeros: " + count);
		*/
		
		String[] helloWorld = { "h", "e", "l", "l", "o", "w", "o", "r", "l", "d" };
		int count = count(helloWorld, "l");
		System.out.println("#occurrences of l: " + count);
		
	}

}
