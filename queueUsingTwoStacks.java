package Java;

import java.util.Stack;

public class queueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		int param1 = queue.pop();
		int param2 = queue.peek();
		boolean param3 = queue.empty();
		
		
		

	}

}

class MyQueue {
    Stack<Integer> inputstack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputstack.push(x);
    }
    
    public int pop() {
      
      if(outputStack.isEmpty()){

        while(!inputstack.isEmpty()){
            outputStack.push(inputstack.pop());
        }
      }

      return outputStack.pop();
    }
    
    public int peek() {
      if(outputStack.isEmpty()){

        while(!inputstack.isEmpty()){
            outputStack.push(inputstack.pop());
        }
      }

      return outputStack.peek();
    }
    
    public boolean empty() {
       return inputstack.isEmpty() && outputStack.isEmpty();
    }
}
