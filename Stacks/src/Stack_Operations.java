// DONT FORGET TO CHECK FOR OVERFLOW AND UN
public class Stack_Operations {

	static class Stack {

		static int a[];
		static int top;

		Stack() {
			top = -1;
			a = new int[10];
		}

		 void push(int data) {
			if (isFull()) {
				System.out.println("Stack is full");
				return ;
			}
			a[++top] = data;
			return ;
		}

		 int pop() {

			if (isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int data = a[top];
			a[top--] = Integer.MIN_VALUE;
			System.out.println("Element popped is "+data);
			return data;
		}

		 boolean isEmpty() {
			return (top == -1);
		}

		 boolean isFull() {
			return (top == a.length - 1);
		}

		 void peek() {
			System.out.println(isEmpty() ? -1 : a[top]);
		}
		
		 void print() {
			 System.out.println("Elements in the stack are ");
			for(int i=top;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {

		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
		stack.pop();
		stack.peek();
		//stack.pop();
		//stack.pop();
		//stack.pop();
		System.out.println(stack.isEmpty());
		stack.print();
	}

}
