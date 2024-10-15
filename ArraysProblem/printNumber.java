package Practice;

import java.util.HashMap;

public class printNumber {
	
	public final  static String[] units = {"", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	public final  static String[] teens = {"Ten", "Eleven", "Tweleve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	public final  static  String[] tens = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Sevety", "Eighty", "Ninety"};

	public static void main(String[] args) {
		
		int num = 221;
		System.out.println(printNum(num));
		

	}
	
	public static String printNum(int num) {
		  
		 if (num==0) {
			 return "zero";
		 }
		 
		 return convertToWordsHelper(num);
	}

	private static String convertToWordsHelper(int num) {
        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convertToWordsHelper(num % 10);
        } else if (num < 1000) {
            return units[num / 100] + " Hundred " + convertToWordsHelper(num % 100);
        } else if (num < 1000000) {
            return convertToWordsHelper(num / 1000) + " Thousand " + convertToWordsHelper(num % 1000);
        } else if (num < 1000000000) {
            return convertToWordsHelper(num / 1000000) + " Million " + convertToWordsHelper(num % 1000000);
        } else {
            return convertToWordsHelper(num / 1000000000) + " Billion " + convertToWordsHelper(num % 1000000000);
        }
    }

}
