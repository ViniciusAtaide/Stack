package classes;

public class Stack {
	Stack top = null;
	Object content = null;
	Stack next = null;	
	
	public Stack() {}	
	
	public void push(Object o) {
		Stack s = new Stack();
		s.content = o; 		
		s.next = this.top;
		this.top = s;
	}
	public Object pop() {
		Stack s = this.top;
		this.top = s.next;
		return s.content;
	}
}
