import java.util.Arrays;

/*
 * Given an array of ints length 3, 
 * figure out which is larger, 
 * the first or last element in the array, 
 * and set all the other elements to be that value. 
 * Return the changed array.
 */
public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = {98,43,122};

		System.out.println(Arrays.toString(modifyArr(arr)));
		
	}

	// your method should start here, 
	// and should be returning an int[]
	public static int[] modifyArr(int[] arr) {
		
		for(int i = 0; i < arr.length; ++i) {
			
			if(arr[0] > arr[arr.length - 1]) {
				arr[i] = arr[0];
			}else {
				arr[i] = arr[arr.length - 1];
			}
		}
		return arr;
	}
}
