package Practice;

public class palindromNum {

	public static void main(String[] args) {
		
		int num = 925;
		int originalNum = num;
		
		int reverse = 0;
		
		while (num!=0) {
			int reminder = num%10;
			reverse = reverse*10 + reminder;
			num = num/10;
				
		}
		
		System.out.println(reverse);
		if (originalNum==reverse) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
		

	}
	
	

}
