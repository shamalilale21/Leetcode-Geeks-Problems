package Practice;

import java.util.Stack;

public class validParenthisis {

	

	
	    public static boolean isValid(String s) {
	        
	    	Stack <Character> stack = new Stack();
	    	
	    	for (char c : s.toCharArray() ) {
	    		
	    		if (c== '(' || c== '{' || c== '[') {
	    			stack.push(c);
	    			System.out.println(stack);
//	    		} else {
//	    			if (stack.isEmpty()) {
//	    				return false;
//	    			}
//	    			
//	    			Character top = stack.pop();
//		    		
//		    		if ((c== ')' && top != '(') || 
//		    		   (c== '}' && top != '{') || 
//		    		   (c== ']' && top!= '[')) {
//		    			return false;
//		    		}
	    		}
	    		
	    		
	    		
	    	}
	    	
	    	String input = " ";
	    	
	    	StringBuilder string = new StringBuilder();
	
	    	
	    	return stack.isEmpty();
	    	
	    	
	    	
	    	
	    	
	    }

	    public static void main(String[] args) {
	        String input = "{[()]}";
	        System.out.println("Is valid: " + isValid(input)); // Output: true

//	        input = "{[(])}";
//	        System.out.println("Is valid: " + isValid(input)); // Output: false
	    }
	}

	    
	

	    
	


