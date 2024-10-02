package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack book = new Stack();
		book.push("Red");
		book.push("black");
		book.push("white");
		System.out.println(book);
		
		System.out.println(book.peek());
		System.out.println(book.pop());
		System.out.println(book.search("Red"));

	}

}
