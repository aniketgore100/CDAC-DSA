package stack;

import java.util.Scanner;

public class BalPara {
	int MaxSize,tos;
	char stack[];
	   void createStack(int size)
	   {
	       MaxSize = size;
	       tos = -1;
	       stack = new char[MaxSize];
	   }
	   
	   void push(char e)
	   {
	       tos++;
	       stack[tos] = e;
	       System.out.println("Pushed "+e);
	   }
	   
	   boolean isFull()
	   {
	       if(tos == MaxSize-1)
	           return true;
	       else
	           return false;
	    }
	   
	   char pop()
	   {
	       char temp = stack[tos];
	       tos--;
	       return temp;
	   }
	   
	    boolean isEmpty()
	   {
	       if(tos == -1)
	           return true;
	       else
	           return false;
	    }
	    
	    void printStack()
	    {
	        System.out.println("stack Has:");
	        for(int i = tos; i >= 0;i--)
	            System.out.println(stack[i]);
	    }
	    
	    
	    
	    
	    
	    public static void main(String[] args) {
			
		        Scanner in = new Scanner(System.in);
		        Stack st = new Stack();
		        System.out.print("Enter data:");
		        String data = in.nextLine();
		        st.createStack(data.length());//creates array of size
		        boolean flag = true;
		        char e ;
		        int i;
		        for(i = 0; i<data.length(); i++) {
		        	char c = data.charAt(i);
		        	if(c == '{') {
		        		st.push(c);
		        	}
		        	else if(c == '}' && !st.isEmpty()) {
		        		e = (char) st.pop();
		        	}
		        	else if(c == '}' && st.isEmpty()) {
		        		System.out.println("Error : } unexpected");
		        		flag = false;
		        		break;
		        	}
		        	if(flag == true && st.isEmpty()) {
		        		System.out.println("balanced");
		        	}
		        	else if(!st.isEmpty() && flag == true) {
		        		System.out.println("error : } expected");
		        	}
		        }
		        
	    }
}
