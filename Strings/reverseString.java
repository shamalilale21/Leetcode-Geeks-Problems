package Practice;

public class reverseString {

	public static void main(String[] args) {
		
		String s = "My name is Shamali";
		String reverstring = " " ;
		
		String [] words = s.split("/n");
		
		for (int i=0; i<words.length; i++) {
			
			String word = words[i];
			String reverseWord = " ";
			
			for (int j=word.length()-1; j>=0; j--) {
				
				reverseWord = reverseWord + word.charAt(j);
			
			}
			
			reverstring = reverstring + reverseWord + " ";
			}

		
		System.out.println(reverstring);
	}

}
