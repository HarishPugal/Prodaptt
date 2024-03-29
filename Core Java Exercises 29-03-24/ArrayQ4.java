package com.packages;

import java.util.Arrays;

public class ArrayQ4 {
	
	    public static void main(String[] args) {
	        
	        int[] myArray = new int[10];
	        for (int i = 0; i < myArray.length; i++) {
	            myArray[i] = (int) (Math.random() * 100) + 1;
	        }
 	      
	        System.out.println("Original array:");
	        System.out.println(Arrays.toString(myArray));

	        Arrays.sort(myArray);

	        System.out.println("Sorted array (increasing order):");
	        System.out.println(Arrays.toString(myArray));
	    }
	}
 