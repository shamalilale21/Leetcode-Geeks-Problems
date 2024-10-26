package Java;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kthSmallestNum smallNum = new kthSmallestNum();
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		int num = smallNum.kthSmallest(arr, k);
		System.out.println(num);

	}

}

class kthSmallestNum {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        
        PriorityQueue <Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<k; i++){
            queue.add(arr[i]);
        }
        
        for(int i=k; i<arr.length;i++){
            if(queue.peek() > arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        
        return queue.peek();
        
    }
}
