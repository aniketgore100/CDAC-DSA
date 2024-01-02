package stack;

import java.util.Scanner;

public class TwoStackArr {
	   int MaxSize,tos1,tos2,stack[];
	   void createStack(int size)
	   {
	       MaxSize=size;
	       tos1=-1;
	       tos2=MaxSize;
	       stack=new int[MaxSize];
	   }
	   void push1(int e)
	   {
	       tos1++;
	       stack[tos1]=e;
	       System.out.println("Pushed "+e);
	   }
	   void push2(int e)
	   {
	       tos2--;
	       stack[tos2]=e;
	       System.out.println("Pushed "+e);
	   }
	   boolean isFull()
	   {
	       if(tos1+1==tos2)
	           return true;
	       else
	           return false;
	    }
	   int pop1()
	   {
	       int temp=stack[tos1];
	       tos1--;
	       return temp;
	   }
	    int pop2()
	   {
	       int temp=stack[tos2];
	       tos2++;
	       return temp;
	   }
	    boolean isEmpty1()
	   {
	       if(tos1==-1)
	           return true;
	       else
	           return false;
	    }
	    boolean isEmpty2()
	   {
	       if(tos2==MaxSize)
	           return true;
	       else
	           return false;
	    }
	    int peek1()
	   {
	       return stack[tos1];
	   }
	    int peek2()
	   {
	       return stack[tos2];
	   }
	    void printStack1()
	    {
	        System.out.println("stack1 Has:");
	        for(int i=tos1;i>=0;i--)
	            System.out.println(stack[i]);
	    }
	     void printStack2()
	    {
	        System.out.println("stack2 Has:");
	        for(int i=tos2;i<MaxSize;i++)
	            System.out.println(stack[i]);
	    }
	    

	         public static void main(String[] args) {
	        	 
	             Scanner scanner = new Scanner(System.in);
	             TwoStackArr twoStackArr = new TwoStackArr();
	             System.out.print("Enter the size of the stack: ");
	             int size = scanner.nextInt();
	             twoStackArr.createStack(size);

	             int choice;
	             do {
	                 System.out.println("\n1. Push to Stack 1");
	                 System.out.println("2. Push to Stack 2");
	                 
	                 System.out.println("3. Pop from Stack 1");
	                 System.out.println("4. Pop from Stack 2");
	                 
	                 System.out.println("5. Peek Stack 1");
	                 System.out.println("6. Peek Stack 2");
	                 
	                 System.out.println("7. Display Stack 1");
	                 System.out.println("8. Display Stack 2");
	                 
	                 System.out.println("0. Exit");
	                 System.out.print("Enter your choice: ");
	                 choice = scanner.nextInt();

	                 switch (choice) {
	                     case 1:
	                         System.out.print("Enter element to push to Stack 1: ");
	                         int element1 = scanner.nextInt();
	                         twoStackArr.push1(element1);
	                         break;
	                     case 2:
	                         System.out.print("Enter element to push to Stack 2: ");
	                         int element2 = scanner.nextInt();
	                         twoStackArr.push2(element2);
	                         break;
	                     case 3:
	                         if (!twoStackArr.isEmpty1()) {
	                             System.out.println("Popped from Stack 1: " + twoStackArr.pop1());
	                         } else {
	                             System.out.println("Stack 1 is empty.");
	                         }
	                         break;
	                     case 4:
	                         if (!twoStackArr.isEmpty2()) {
	                             System.out.println("Popped from Stack 2: " + twoStackArr.pop2());
	                         } else {
	                             System.out.println("Stack 2 is empty.");
	                         }
	                         break;
	                     case 5:
	                         if (!twoStackArr.isEmpty1()) {
	                             System.out.println("Peek Stack 1: " + twoStackArr.peek1());
	                         } else {
	                             System.out.println("Stack 1 is empty.");
	                         }
	                         break;
	                     case 6:
	                         if (!twoStackArr.isEmpty2()) {
	                             System.out.println("Peek Stack 2: " + twoStackArr.peek2());
	                         } else {
	                             System.out.println("Stack 2 is empty.");
	                         }
	                         break;
	                     case 7:
	                         twoStackArr.printStack1();
	                         break;
	                     case 8:
	                         twoStackArr.printStack2();
	                         break;
	                     case 0:
	                         System.out.println("Exiting program.");
	                         break;
	                     default:
	                         System.out.println("Invalid choice. Please try again.");
	                 }
	             } while (choice != 0);

	             scanner.close();
	     }
}
