package Practice;

import java.util.Arrays;

public class mergeTwoArray {

	public static void main(String[] args) {
		int arr1[] = {0, 3,4,7};
		int n1 = arr1.length;
		
		int arr2[] = {1,2,5,6,8};
		int n2 = arr2.length;
		
		int arr3[] = new int [n1+n2];
		
		mergeTwoArrays(arr1, arr2, arr3, n1, n2);
		
		for (int i=0; i< n1+n2; i++) {
			System.out.print(arr3[i] + " ");
		}

	}
	
	public static void mergeTwoArrays(int[] arr1, int[] arr2, int[] arr3, int n1, int n2) {
		
		 int i=0;
		 int j=0;
		 int k=0;
		 
		 while (i<n1) {
			 
			 arr3[k++] = arr1[i++];	 
		 }
		 
		 while (j<n2) {
			 arr3[k++] = arr2[j++];
		 }
		 
		 Arrays.sort(arr3);
		 
		 
		 
		
	}

}
