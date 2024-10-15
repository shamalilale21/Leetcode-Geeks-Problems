package Practice;

public class armstrongNum {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 500;
		isArmstrong(num1, num2);

	}
	
	public static void isArmstrong(int num1, int num2) {
		
		   for (int i= num1; i<=num2; i++) {
			   
			   int y = i;
			   int n = 0;
			   
			   while (y!=0) {
				   y = y/10;
				   ++n;
			   }
			   
			   int sum = 0;
			   
			   y = i;
			   while (y!=0) {
				   
				   int d = y%10;
				   sum = (int) (sum + Math.pow(d, n));
				   y = y/10;
				    
			   }
			   
			   if (sum==i) {
				   System.out.println(i);
			   }
			   
			   
			   
			   
			   
		   }
		
		
		
		
		
	}

}
