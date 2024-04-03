package newpackages;

public class MainSwapping {
	   public static void main(String[] args) {
	       Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 10};
	       System.out.println("Original array:");
	       printArray(numbers);
	       
	       SwapArray.swap(numbers, 0, 4);
	       System.out.println("Array after swapping:");
	       printArray(numbers);
	   }
	   private static <T> void printArray(T[] arr) {
	       for (T item : arr) {
	           System.out.print(item + " ");
	       }
	       System.out.println();
	   }
	}