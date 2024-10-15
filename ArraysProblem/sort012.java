package Practice;

public class sort012 {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 2, 0, 1, 1};
		
		int n = arr.length;
		
		sorting(arr, n);
		
		for (int i=0; i<n; i++) {
			System.out.print( arr[i] + " ");
		}
		
		
	

	}
	
	public static void sorting (int arr[], int n) {
		
		int zero = 0;
		int one = 0;
	    int two = 0;
	    
	    for (int i=0; i<n; i++) {
	    	
	    	if (arr[i]==0) {
	    		zero++;
	    	} else if (arr[i]==1) {
	    		one++;
	    	} else if (arr[i]==2){
	    		two++;
	    	}
	    
	    int index =0;
	    for (int j=1; i<=zero; i++) {
	    	arr[index++] = 0;
	    	
	    }
	    for (int j=1; i<=one; i++) {
	    	arr[index++] = 1;
	    	
	    }
	    for (int j=1; i<=two; i++) {
	    	arr[index++] = 2;
	    
	    }
		
		
	    }

	}
}
