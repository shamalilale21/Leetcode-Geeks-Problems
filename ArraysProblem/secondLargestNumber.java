package Practice1;

public class secondLargestNumber {

	public static void main(String[] args) {
		int [] arr = {30, 2, 40, 32, 6, 7, 7};
		System.out.println(secondLargest(arr));
		

	}
	
	public static int secondLargest(int[] arr) {
		
		int largest = 0;
		int secondlargest = 0;
		int thirdlargest = 0;
		
		for (int num : arr) {
			
			if (num>largest) {
				secondlargest = largest;
				largest = num;
			} else if (num>secondlargest && num!=largest) {
				secondlargest = num;
			} 
			
			
		}
		return secondlargest;
		
		
		
		
	}

}
