package test;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		int x, y, opt;
		char ch;
		do{
		
		
		System.out.println("Enter Two Numbers\n");
		Scanner obj = new Scanner(System.in);
		x = obj.nextInt();
		y = obj.nextInt();

		System.out.println("Enter the operation\n");
		System.out.println("1. Addition 2.Subtraction 3. Multiplication 4. Division\n");
		opt = obj.nextInt();
       
	
		switch (opt) 
	    {
		case 1: {

			System.out.println("Sum =" + (x + y));
			break;
		}
		case 2: {

			System.out.println("Difference =" + (x - y));
			break;
		}
		case 3: {

			System.out.println("Product =" + (x * y));
			break;
		}
		case 4: {

			System.out.println("Quotient =" + (x / y));
			break;
		}

		default:
		{
			 System.out.println("Invalid input");
             break;
		}
	   }
	 System.out.println("Do you want to continue? Y or N");
	 ch= obj.next().charAt(0);
	 }while((ch=='y')||(ch=='Y')); 
		 
	}
}
