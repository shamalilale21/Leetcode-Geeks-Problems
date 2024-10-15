package Practice;

public class duplicatesInString {

	public static void main(String[] args) {
		String s = "environment";
		
		char[] arr = s.toCharArray();
		int n = arr.length;
		countDuplicates(arr, n);
		

	}
	
	public static void  countDuplicates (char [] arr, int n) {
		
		int max =0;	
		int secondmax = 0;
		char ch = 0;
		char secondch = 0;
		
		for (int i=0; i<arr.length; i++) {
			int count =0;
			for (int j=1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			
			if (count>max) {
				secondmax = max;
				max = count;
				secondch = ch;
				ch = arr[i];
			}
			
			
		}
		System.out.println(secondch);		
			
		}
		
		
	}


