package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueCol {

	static void enq(Queue<Integer>q, int n) {
		Scanner sc = new Scanner(System.in);
		
			for(int i=0; i<n; i++) {
				int j = sc.nextInt();
				q.add(j);
			}
		
	}
	
	static void dq(Queue<Integer>q, int n) {
		for(int i=0; i<n; i++) {
			int k = q.remove();
			System.out.println("remove element is :"  + k);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer>q = new LinkedList<>();
		System.out.println("enter size of the q : ");
		int size = sc.nextInt();
		enq(q, size);
		dq(q,  size);
	}

}
