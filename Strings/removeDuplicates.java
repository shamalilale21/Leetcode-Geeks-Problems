package Practice;

public class removeDuplicates {

	public static void main(String[] args) {
		
		int [] arr = {10,4,2,3,10,3};
		
		
		int n = removeDuplicate(arr);
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}
	
	public static int removeDuplicate(int[] arr) {
	    int n = arr.length; // Get the length of the array
	    if (n == 0 || n == 1) {
	        return n; // No duplicates to remove
	    }

	    int index = 0;

	    for (int i = 0; i < n - 1; i++) {
	        if (arr[i] != arr[i + 1]) {
	            arr[index++] = arr[i]; // Shift non-duplicate elements to the beginning
	        }
	    }

	    arr[index++] = arr[n - 1]; // Copy the last element

	    return index; // Length of the array with unique elements
	}


}
