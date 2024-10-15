package Java;

public class factorial {

	public static void main(String[] args) {
		   /*int i, fact=1;
		   int num= 5;
		   for (i=1; i<=num; i++) {
			   
			   fact = fact*i;
			   
		   }
		   System.out.println(fact);*/

		    
		        // Calculate factorial of 5
		        int number = 5;
		        int factorial = calculateFactorial(number);

		        // Display the result
		        System.out.print("Factorial of " + number + " = " + displayFactorialExpression(number));
		        System.out.println(factorial);
	}

		    // Function to calculate factorial
		    private static int calculateFactorial(int n) {
		    	 int i=0, fact=1;
		    	 for ( i=1; i<=n;i++) {
		    		 
		    		 fact = fact*i;
		    		 
		    	 }
				return fact;
		     
		        
		    }

		    // Function to display factorial expression
		    private static String displayFactorialExpression(int n) {
		    	StringBuilder sb = new StringBuilder();
		    	for (int i=n; i>=1;i--) {
		    		sb.append(i);
		    		
		    		if (i>1) {
		    			sb.append(" * ");
		    		} 
		    		
		    	}
		    	
		    	sb.append(" = ");
		    	
		    	return sb.toString();
		    	
		        
		    }
		

	}


