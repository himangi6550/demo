/*
 * Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
public static int[] copyOf(int[] array)

 */
package com;

public class q4 {
	public static void main(String[] args) {
		int[] originalArray = new int[] { 44, 43, 24, 777, 90 };

		System.out.println("Original Array : ");
		for (int i : originalArray)
			System.out.print(i + " ");
		System.out.println();
		int[] copiedArray = copyOf(originalArray);

		System.out.println("Copy of above Array: ");
		for (int n : copiedArray)
			System.out.print(n + " ");
	}

	public static int[] copyOf(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
}
