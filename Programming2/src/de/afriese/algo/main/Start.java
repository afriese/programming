package de.afriese.algo.main;

import java.util.Arrays;

import de.afriese.algo.sort.QuicksortFirst;

public class Start {
	public static void main(String[] args) {
		int[] array = new int[500];
		int oberGrenze = 10000;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * oberGrenze);
		}
		
		System.out.println(Arrays.toString(array));

		QuicksortFirst quicksortFirst = new QuicksortFirst();
		quicksortFirst.quickSort(array);

		System.out.println(Arrays.toString(array));
	}
}
