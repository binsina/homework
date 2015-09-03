package Quadradic;

import java.util.Scanner;

public class QuadradicNoVariable {
	
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	   
	    double x = 0;
	    double answer = 0;
	   
	    System.out.print("Enter the value of x : "); 
	    x = input.nextDouble();
	    
            answer = (3 * (x * x) - (8 * x) + 4);
	    System.out.printf("At the Value of %s, The resulting Value is: %s", x,answer);
	    
	    
	}
	
}
	    
	   
	   
	    
	  