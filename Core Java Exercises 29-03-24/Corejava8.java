package com.packages;

import java.util.Scanner;

public class Corejava8 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of array elements: ");
		int x = Scan.nextInt();
		System.out.println("Enter the elements: ");
		int[] myArray = new int[x];
		for (int i = 0; i < x; i++) {
			myArray[i] = Scan.nextInt();
		}
		int Index = findSmallestelementIndex(myArray);
		System.out.println("Smallest element's Index  is: " + Index);
		Scan.close();
	}
 
	public static int findSmallestelementIndex(int[] arr) {
 
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					position =j;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 
				}
			}
		}
		return position;
	}
}
 

