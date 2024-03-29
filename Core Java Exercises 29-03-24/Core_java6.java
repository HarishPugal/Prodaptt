package com.packages;

import java.util.Scanner;

public class Core_java6 {
 
	    public static void main(String[] args) {
	    	Scanner Scan = new Scanner(System.in);
	    	System.out.println("Enter the no of array elements: ");
	    	int x = Scan.nextInt();
	    	System.out.println("Enter the elements: ");
	        int[] myArray = new int[x];
	        for(int i=0;i<x;i++) {
	        	myArray[i]=Scan.nextInt();
	        }
	        int Total = calculateSum(myArray, myArray.length - 1);
	        System.out.println("Sum of array elements: " + Total);
	        Scan.close();
	    }
 
	    public static int calculateSum(int[] arr, int position) {
	        if (position < 0) {
	            return 0; // Base case: When index becomes negative, return 0
	        } else {
	            return arr[position] + calculateSum(arr, position - 1); // Recursive case
	        }
	    }
	}