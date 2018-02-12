package ArrayBS;

import java.util.Scanner;

public class EditString {

	public static void main(String[] args) {

		ArrayBoundedStack<String> object = new ArrayBoundedStack<String>();    
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write some sentance here and press enter");
		String sentance = sc.nextLine(); 
		System.out.println("Please Choose letters from the belove" 
				+ "\nL-This will convert string to lowercase "
				+ "\nU-This will convert string to uppercase"
				+ "\nR-this will reverse string"
				+ "\nC-this will replaces old char with new char"
				+ "\nZ-this will return the previous operation"
				+ "\nX-this will end the operation, Enter X when you are done");
		object.pushMethod(sentance);
		String commands = sc.nextLine();
		//obj.pushMethod(s2);
		
		while(!(commands.equals("X"))) 
		{
		if(commands.equals("U"))
		{
		sentance=object.topMethod().toUpperCase();
		object.pushMethod(sentance);
		}
		else if(commands.equals("L"))
		{
		sentance=object.topMethod().toLowerCase();
		object.pushMethod(sentance);
		}
		else if(commands.equals("R"))
		{
		sentance=new StringBuffer(object.topMethod()).reverse().toString();
		object.pushMethod(sentance);
		}
		else if(commands.charAt(0)=='C')
		{
		sentance=object.topMethod().replace(sentance.charAt(2),sentance.charAt(4));
		object.pushMethod(sentance);

		}
		else if(commands.equals("Z"))
		{
		object.popMethod();
		}
		commands=sc.nextLine();
		}
		System.out.println(object.topMethod());	
			
}
}

	  class ArrayBoundedStack<T> {
		protected final int DEFCAP=10; 
		protected T[] stack; 
		protected int topIndex = -1; 
	
		public ArrayBoundedStack()
		{
			stack = (T[]) new Object[DEFCAP]; 
		}
		public ArrayBoundedStack( int maxSize)
		{
			stack = (T[]) new Object [maxSize]; 
			
		}
		public void pushMethod(T element) 
		{
			if(!isFull())
			{
				topIndex++;
				stack[topIndex] = element; 
			}
			else {
				System.out.println("The stack is full");
			}
			
		}
			public void popMethod()
			{
				if(!isEmpty())
				{
					stack[topIndex]= null;
					topIndex--; 
				}
				else {
					System.out.println("Stack is empty");
				}
					
			}
			
			public T topMethod()
			{
			T topOfStock = null; 
			if(!isEmpty())
			{
				topOfStock= stack[topIndex];
				
			}
			else
			{
				System.out.println("Stack is empty");
			return topOfStock; 	
			}
			return topOfStock;
			
			}
			public boolean isEmpty()
			{
				if(topIndex==-1)
					return true; 
				else 
					return false; 
			}
			public boolean isFull()
			{
				if(topIndex== (stack.length-1))
					return true; 
				else 
					return false; 
			}
	  }

	
	
 


