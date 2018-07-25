import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		// arrays must be declared with a size
		int[] arr = new int[4]; //the values by default are 0 for indexes 0 - 3
		
		arr[0] = 55;
		arr[2] = 77;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		String name = "John";
		String[] arr2 = {name, "Ben", "Cheo", "Camilla"};
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] == "Cheo") {
				System.out.println(arr2[i]);
			}
		}
		
		//declaring and assign a size in 2 steps
		final int SIZE = 105;
		double[] arr3;
		arr3 = new double[SIZE];
		
		// declaring, assigning size, and value in 1 step
		double[] arr4 = {4.5, 6.8, 9.9, 10.7};
		
		
		//let a user assign the size
		System.out.println("Hey! Please enter a number: ");
		int userNum = scan.nextInt();
		
		boolean arr5[] = new boolean[userNum];
		
		System.out.println(arr5.length);
		
		//enhanced for loop aka "for each"
		//the disadvantage to this is that we don't have access to the index
		for (boolean temp : arr5) {
			System.out.println(temp);
		}
		
		int[] nums= {6, 7, 23, 44, 8};
		System.out.println(sumArray(nums));
		
		double sum = sumArray(nums);
		double average = sum / nums.length;//average of all array values
		System.out.println(average);
		
		// can make arrays of Objects like a Robot
		// by default if no value is added the value is null
		Robot[] robotArr = new Robot[2];
		robotArr[0] = new Robot("Grant Chirpus", 5);
		
		for (Robot r : robotArr) {
			System.out.println(r);
		}
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		for(int temp : arr) {
			sum += temp;// sum = sum + temp;
			
		}
		return sum;
	}

}
