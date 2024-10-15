package Practice1;

public class evenAndOdd {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int n = 2;
		int m = 3;
		
		for (int i=0; i<arr.length; i++) {
			
			if (i%2==0) {
				
				arr[i] = arr[i] - n;
				
			} else {
				arr[i] = arr[i] - m;
			}
		}
		
		for (int num : arr) {
			System.out.println(num + "");
		}
		

	}
	

}
