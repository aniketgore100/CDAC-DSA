package queue;

import java.util.Scanner;

public class QueueOp {

	int front, rear, maxsize, q[];
	
	void createQueue(int size) {
		maxsize = size;
		front = 0;
		rear = -1;
		q = new int[maxsize];
	}
	
	void enqueue(int e) {
		rear++;
		q[rear] = e;
		System.out.println("enqueued : " + e);
	}
	
	int dequeue() {
		int temp = q[front];
		front++;
		return temp;
	}
	
	boolean iFull() {
		if(rear == maxsize - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if(front > rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void printQ() {
		System.out.println("Q has : ");
		for(int i = front; i<=rear; i++) {
			System.out.println( " - " + q[i] );
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of Q : ");
		int size = in.nextInt();
		QueueOp q = new QueueOp();
		q.createQueue(size);
		int ch;
		do {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
			ch = in.nextInt();
			switch(ch) {
			case 1: 
				if(q.iFull()) {
					System.out.println("overflow");
				}
				else {
					int data = in.nextInt();
					q.enqueue(data);
				}
				break;
			case 2 : 
				if(q.isEmpty()) {
					System.out.println("Q is empty");
				}else {
					System.out.println("deQ : " + q.dequeue());
				}
				break;
			case 3: 
				if(q.isEmpty()) {
					System.out.println("Q is empty");
				}else {
					System.out.println("elements is Q are : ");
					q.printQ();
				}
				break;
			 case 0:
                 System.out.println("Exiting");
             break;
         default:
                 System.out.println("Wrong Choice");
             break;
			}
		}while(ch != 0);
	}

}
