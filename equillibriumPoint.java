package Java;

public class equillibriumPoint {
	
	//equillibriumPoint = index of element such that sum of all elements before that index 
	//                    is sum of elements after it

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		equiPoint ePoint = new equiPoint();
		long arr[] = {1, 3, 5, 2, 2};
		int num = ePoint.equilibriumPoint(arr);
		System.out.println(num);

	}

}



class equiPoint {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        
        long totalSum = 0;
        long leftSum= 0;
        
        for(long num : arr){
            totalSum = totalSum+num;
        }
        
        for(int i=0; i<arr.length;i++){
            
            if(leftSum==(totalSum-leftSum-arr[i])){
                return i+1;
            }
            
            leftSum = leftSum + arr[i];
        }
        
        return -1;
    }
}
