package test;

import classes.Stack;



public class Application {

	public static void main(String[] args) {
		int i = 12, k = 14;
		String j = "teste";
		
		Stack stck = new Stack();
		stck.push(i);
		stck.push(k);
		stck.push(j);
		System.out.println(stck.pop());
		System.out.println(stck.pop());
		stck.push(stck);
		System.out.println(((Stack) stck.pop()).pop());
	}
}
