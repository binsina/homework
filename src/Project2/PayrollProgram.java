package Project2;

import java.util.Scanner;

public class PayrollProgram
{
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);

				String cleanInputBuffer;
				String employeeName;
				double hourlyRate;
				double hoursWorked;
				double sum;
				double tax;
				boolean end = false;

			System.out.println("Welcome to the Payroll Program!\n");

			while (end == false)
			{
				hourlyRate = -1;
				hoursWorked = -1;
                                tax = -1;
				System.out.println("Enter Name of Employee(enter 'stop' to exit program): ");
					employeeName = input.nextLine();
                
					int lengthName = employeeName.length();
                    if (lengthName < 0); 
                    	System.out.println("Enter Letter only please:");     
                    	cleanInputBuffer = input.nextLine();
                     
                    	if ("stop".equals(employeeName)) 
					end = true;
                     
					System.out.println("Enter a positive hourly rate:");
						hourlyRate = input.nextDouble();
                    
				while (hoursWorked < 0)
				{
					System.out.println("Enter a positive number of hours worked:");
						hoursWorked = input.nextDouble();
				}
				sum = hourlyRate * hoursWorked;
				tax = 0.10 * sum;
				System.out.printf("The employee %s was paid $ %s this week\n\n", employeeName, sum);
				System.out.printf("The employee %s was taxed $ %s this week\n\n", employeeName, tax);
				cleanInputBuffer = input.nextLine();

			}

		}
}
	
