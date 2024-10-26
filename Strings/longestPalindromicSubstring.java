package Java;

public class longestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindromeString pal = new palindromeString();
		String longest = pal.longestPalindrome("babad");
		System.out.println(longest);

	}

}

class palindromeString {
	
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i=0; i<s.length(); i++){

            String oddPalindrome = expandString(s, i, i);
            String evenPalindrome = expandString(s, i, i+1);

            if(oddPalindrome.length()>longest.length()){
                longest = oddPalindrome;
            }else if(evenPalindrome.length()>longest.length()){
                longest = evenPalindrome;
            }

        }

        return longest;
        
        
    }

    public String expandString(String s, int left ,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
               left--;
               right++;
        }
        return s.substring(left+1, right);
    }
}
