package com.packages;

import java.util.Arrays;
import java.util.Scanner;
public class CoreJava7 {
 
 
		    public static void main(String[] args) {
		    	Scanner Scan = new Scanner(System.in);
		    	System.out.println("Enter the no of array elements: ");
		    	int x = Scan.nextInt();
		    	System.out.println("Enter the elements: ");
		        int[] myArray = new int[x];
		        for(int i=0;i<x;i++) {
		        	myArray[i]=Scan.nextInt();
		        }
		        int min = findSmallest(myArray);
		        System.out.println("Smallest element in array is: " +min);
		        Scan.close();
		    }
 
		    public static int findSmallest(int[] arr) {
		    	Arrays.sort(arr);
		    	
				return arr[0];
		        
		    }
		}
 