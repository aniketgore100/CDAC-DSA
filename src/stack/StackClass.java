package stack;
import java.util.Scanner;
import java.util.Stack;

public class StackClass {

	static void stack_push(Stack<Integer>st, int n) {
	    Scanner sc = new Scanner(System.in);
		for(int i =0; i<n; i++) {
			System.out.println("enter the element at : " + i);
			int element = sc.nextInt();
			st.push(element);
		}
	}
	static void print(Stack<Integer>st, int n) {
		for(int i =0; i<n; i++) {
			int element = st.pop();
			System.out.println("printing element from  stack : " + element);
		}
	}
	
//	static void rearrange(Stack<Integer>duplicate,Stack<Integer>st,  int n) {
//		if(n == 0) {
//			System.out.println("stack is empty");
//		}
//		else {
//			for(int i = 0; i<n; i++) {
//				int j = st.pop();
//				duplicate.push(j);
//			}
//		}
//	}
	
	static void printDupli(Stack<Integer>duplicate, int n) {
		for(int i = 0; i<n; i++) {
			int k = duplicate.pop();
			System.out.println("printing element from Duplicate stack : " + k);
		}
		
	}
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	Stack<Integer>st = new Stack<>();
	//Stack<Integer>duplicate = new Stack<>();
	System.out.println("enter size");
	int n = sc.nextInt();
	 stack_push(st, n);
	    print(st, n);
	   // rearrange(duplicate, st, n);
	  // printDupli(duplicate, n);
}
}
