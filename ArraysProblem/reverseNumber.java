package Java;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		
		String numStr = Integer.toString(num);
		
		//System.out.println(numStr);
		String reverse = "";
		
		for(int i=numStr.length()-1; i>=0; i--) {
			
			reverse = reverse + numStr.charAt(i);
		}
		
		int reverseNum = Integer.parseInt(reverse);
		
		System.out.println(reverseNum);

	}

}
