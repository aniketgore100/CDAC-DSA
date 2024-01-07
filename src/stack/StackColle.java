package stack;
import java.util.Scanner;
import java.util.Stack;
public class StackColle {
	
	
	
	static void StackPush(Stack<Integer>st, int n) {
		Scanner sc = new Scanner(System.in);
		if(st.size() == n-1) {
			System.out.println("stack is full");
		}else {
			
			for(int i=0; i<n; i++) {
				int data = sc.nextInt();
				st.push(data);
			}
		}
	}
	
	static void display(Stack<Integer>st, int n) {
		for(int i=0; i<n; i++) {
			if(st.empty()) {
				System.out.println("stack is empty");
			}else {
				int k = st.pop();
				System.out.println("elements are : "  + k);
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <Integer> st = new Stack<>();
		System.out.println("enter stack size");
		int n = sc.nextInt();
		StackPush(st, n);
		display(st, n);
	}

}
