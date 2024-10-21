package DSA_assignment5;

import java.util.Scanner;

public class Reverse_String_Stack {
	private char stack[];
	int MaxSize, tos;

	public void createStack(int size) {
		MaxSize = size;
		tos = -1;
		stack = new char[MaxSize];

	}

	public void push(char e) {
		tos++;
		stack[tos] = e;
		
	}

	public boolean isFull() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	public char pop() {
		char temp = stack[tos];
		tos--;
		return temp;
	}

	public boolean isEmpty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Reverse_String_Stack se = new Reverse_String_Stack();
		Scanner sc = new Scanner(System.in);
		// read line of date
		System.out.println("Enter the string to revers");
		String input = sc.next();
		String rword="";
		se.createStack(input.length());
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
				se.push(c);
		}
		
		while(se.isEmpty()!=true)
		{
			rword=rword+se.pop();	
			
			
		}
		System.out.println(rword);
}

}
