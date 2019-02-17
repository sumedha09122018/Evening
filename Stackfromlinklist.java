import java.util.*;
class Node
{
	int data;
	Node next;
};

class Stack
{
	private Node top;

	public Stack() {
		this.top = null;
	}

	public void push(int x) 
	{
		Node node = new Node();
		if (node == null)
		{
			System.out.print("\nHeap Overflow");
			return;
		}
                         System.out.println("Inserting " + x);
		node.data = x;
		node.next = top;
		top = node;
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public int peek()
	{
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop()
	{
		if (top == null)
		{
			System.out.print("\nStack Underflow");
			return;
		}
                       System.out.println("Removing " + peek());
		top = (top).next;
	}
}
class Stackfromlinklist
{
	public static void main(String[] args)
	{
		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
                                System.out.println("Top element is " +  stack.peek());
                                stack.pop();
		stack.pop();
		stack.pop();
                           if (stack.isEmpty()) 
                          {
			System.out.print("Stack is empty");
		}
                         else
                            {
			System.out.print("Stack is not empty");
		}
	}
}