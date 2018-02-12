package ArrayBS;

import java.util.Scanner;

public class TowerHanoi {
	static int count ;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n; 
		System.out.println("Hello user \nThis is the tower of Hanoi \nGood Luck!!");
		while(true){
			
		
		System.out.println("Input the number of rings: ");
		if (sc.hasNextInt())
			n=sc.nextInt(); 
		else 
		{
			System.out.println("You must enter an integer");
			System.out.println("Program will not work");
			return;
		}
		
		doTower(n, 1, 2, 3);
		System.out.println("total number of counts is " + count);
		System.out.println("--------------------------------");
		
	}
	}
public static void doTower
( int n,int StartPeg, int auxPeg, int endPeg) {
	
	if(n==1)
	{
		
			
		System.out.println( "Please move ring " + n + " from peg " + StartPeg + " to peg " + endPeg );
			count++; 
	}
	else if(n<0){
		System.out.println("Game over \nThank You\nTry again");
		System.exit(0);
		
	}
		else 
	{ 
	doTower(n-1, StartPeg, endPeg, auxPeg);	
	
	System.out.println("Please move ring " + n + " from peg " + StartPeg + " to peg " + endPeg);
	
	count++; 
	doTower(n-1, auxPeg, StartPeg, endPeg);
	}

} 

} 
