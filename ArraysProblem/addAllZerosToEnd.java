package Practice1;

public class addAllZerosToEnd {

	public static void main(String[] args) {
		
		int [] arr = {25, 30, 0, 35, 0, 0, 40, 50};
		int n = arr.length;
		
		countZeros(arr, n);
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void countZeros(int [] arr, int n) {
		
		int count = 0;
	     n = arr.length;
		
	     for (int i=0; i<n; i++) {
	    	 
	    	 if (arr[i]!= 0) {
	    		 
	    		 arr[count++] = arr[i];
	    	 }  
	    	 
	    	 
	     }
	     while (count<n) {
	    	 arr[count++] = 0;
	     }
	     
		
		
	}

}
