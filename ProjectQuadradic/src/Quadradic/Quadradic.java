package Quadradic;
import java.util.Scanner;
public class Quadradic {
	

	
	  public static void main(String[] args)
	  {
	    Scanner input = new Scanner(System.in);
	   
	    double a = 0;
	    double b = 0;
	    double c = 0;
	    double answer = 0;

	    System.out.print("Enter the value of a : "); 
	    a = input.nextDouble();
	           
	    System.out.print("Enter the value of b : "); 
	    b = input.nextDouble();
	 
	    System.out.print("Enter the value of c : "); 
	    c = input.nextDouble();
	   
	    answer = (3 * (a * a) - (8 * b) + 1);
	    System.out.print("The Answer to the Equation 3x2-8x+4 is:" + " " + answer);
	    
	   
	    
	   
	   
	    }
	  }
	 

