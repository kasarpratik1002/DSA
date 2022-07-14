
public class StackTest {
	
	
	static class Stack{
		int top;
		int a[];
		Stack(){
			top=-1;
			
			a=new int[10];
		}
		
		
		boolean isEmpty() {
			return (top<0);
		}
		boolean isFull() {
			return (top>a.length-1);
		}
		
		void push(int data) {
			if(isFull()) {
				System.out.println("Stack OverFlow");
				return;
			}
			a[++top]=data;
			System.out.println(data +" is pushed");
		}
		int pop() {
			if(isEmpty()) {
				System.out.println("Stack underflow");
				return -1;
			}
			int data=a[top];
			a[top--]=Integer.MIN_VALUE;
			//note always return the data which is popped
			return data;
		}
		
		int peek() {
			if(!isEmpty()) {
				return a[top];
			}
			return -1;
		}
		
		
		
	}
	public static void main(String[] args) {
		
		
		Stack stk=new Stack();
		stk.push(12);
		stk.push(144);
		stk.pop();
		System.out.println(stk.peek());
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}
