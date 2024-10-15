package Practice;

public class firstUniqueChar {

	public static void main(String[] args) {
        String s = "nagraj";
        int result = firstUniChar(s);

        if (result != -1) {
            System.out.println("Index of the first non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static int firstUniChar(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && chars[i] == chars[j]) {
                    count = 1;
                    break;
                }
            }

            if (count == 0) {
                return i;  // Return the index of the first non-repeating character
            }
        }

        return -1;  // No non-repeating character found
    }
		
		
	}



