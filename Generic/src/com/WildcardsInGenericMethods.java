package com;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WildcardsInGenericMethods {

	public static int count(Collection<? extends Number> col, Number item) {
		int count = 0;

		if (item == null) {
			for (Number element : col) {
				if (element == null)
					count++;
			}
		} else {
			for (Number element : col) {
				if (item.equals(element)) {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		List<Long> integers = Arrays.asList(0l, 1l, 0l, 1l, 0l, 0l, 1l, 1l, 0l, 0l, 1l, 0l, 1l);
		int count = count(integers, 1L);
		System.out.println("#occurrences of 1s: " + count);
		
		
		List<String> strings=Arrays.asList("h", "e", "l", "l", "o", "w", "o", "r", "l", "d");
		//count(strings,'l');
	}

}
