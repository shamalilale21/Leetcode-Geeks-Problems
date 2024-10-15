package Practice;

public class twoSum {

	public static void main(String[] args) {
		
		int [] num = {2,7,11,15};
		int target = 9;
		twoSum(num, target);
		

	}
	
	public static void twoSum (int[]num, int target) {
		
		int n = num.length;
		
		for (int i=0; i<n; i++) {
			
			for (int j=i+1; j<n; j++) {
				
				if (num[i]+num[j]==target) {
					System.out.println(i + " " + j);
				} 
			}
			
			
		}
		
	    
		
	}

}
