package Java;

import java.util.ArrayList;

public class stockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stockBuySell stockBS = new stockBuySell();
		int A[] = {100,180,260,310,40,535,695};
		int n = A.length;
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list = stockBS.stockBuySell(A, n);
		
		System.out.println(list);
	}

}



//User function Template for Java

class stockBuySell {
  //Function to find the days of buying and selling stock for max profit.
  ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
      // code here
      
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      
      
      int i=0;
      
      while(i<n-1){
          ArrayList<Integer> list1 = new ArrayList<>();
          
          while(i<n-1 && A[i+1]<=A[i]){
              i++;
          }
          
          if(i==n-1){
              break;
          }
          
          list1.add(i);
          
          i++;
          
          while(i<n && A[i]>=A[i-1]){
              i++;
          }
          
          list1.add(i-1);
          
          list.add(list1);
          
          
          
      }
      
      
      return list;
  }
}
