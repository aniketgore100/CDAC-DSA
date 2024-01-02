package stack;

import java.util.Scanner;

public class MaxStack {
    int MaxSize, tos;
    int stack[];
    int[] maxStack;

    void createStack(int size) {
        MaxSize = size;
        tos = -1;
        stack = new int[MaxSize];
    }

    void push(int e) {
    	// push for normal stack
        tos++;
        stack[tos] = e;
        System.out.println("Pushed " + e);
    }
    
    int peek()
	{
	       return stack[tos];
	}

    boolean isFull() {
        return tos == MaxSize - 1;
    }

    int pop() {
        int temp = stack[tos];
        tos--;
        return temp;
    }

    boolean isEmpty() {
        return tos == -1;
    }

   

    void printStack() {
        System.out.println("Stack Has:");
        for (int i = tos; i >= 0; i--)
            System.out.println(stack[i]);
    }

    public static void main(String[] args) {
    	int ch;
        Scanner in =new Scanner(System.in);
        MaxStack Normal_stack=new MaxStack();
        MaxStack Max_stack=new MaxStack();
        Normal_stack.createStack(16);
        Max_stack.createStack(16);
         do
        {
            System.out.print("\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Max\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(Normal_stack.isFull()!=true)//if not full then push
                    {
                        System.out.print("Enter elment:");
                        int e=in.nextInt();
                        if(Max_stack.isEmpty())
                        { System.out.print("Max updated:");
                            Max_stack.push(e);
                        }
                        else if(e>Max_stack.peek())
                        { System.out.print("Max updated:");
                            Max_stack.push(e);
                        }
                        Normal_stack.push(e);
                        }
                    else
                        System.out.print("Stack Full");
                    break;
                case 2:
                    if(Normal_stack.isEmpty()!=true)//if not empty then pop
                    {
                        if (Normal_stack.peek()==Max_stack.peek())
                            System.out.print("Max Stack also poped:"+Max_stack.pop());
                        System.out.print("poped:"+Normal_stack.pop());
                        
                    }
                    else
                        System.out.print("Stack Empty");
                    break;
                case 3:
                    if(Normal_stack.isEmpty()!=true)//if not empty then pop
                    {
                        System.out.print("Element @ Peek is:"+Normal_stack.peek());
                    }
                    else
                        System.out.print("Stack Empty");
                    break;
                    case 5:
                    if(Max_stack.isEmpty()!=true)//if not empty then pop
                    {
                        System.out.print("Max Element @ is:"+Max_stack.peek());
                    }
                    else
                        System.out.print("Stack Empty");
                    break;
                case 4:
                    if(Normal_stack.isEmpty()!=true)//if not empty then pop
                    {
                      Normal_stack.printStack();
                    }
                    else
                        System.out.print("Stack Empty");
                    break;
                case 0:
                        System.out.print("Exiting code");
                        break;
                default:
                        System.out.print("Wrong input");
                        break;
            }
        }while(ch!=0);

       

        
    }
}
