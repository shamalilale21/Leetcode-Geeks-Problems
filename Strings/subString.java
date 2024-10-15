package Practice;

public class subString {

	public static void main(String[] args) {
		
		String str1 = "WorldHello";
		String s = "Hello";
		int result = checkSubstring(str1, s);
		System.out.println(result);

	}
	
	public static int checkSubstring(String str1, String s) {
		
		int n1 = str1.length();
		int n2 = s.length();
		
		for (int i=0; i<=n1-n2; i++) {
			
			if (str1.substring(i, i+n2).equalsIgnoreCase(s)) {
				return i;
			}
			
			
		}
		
		return -1;
	}

}
