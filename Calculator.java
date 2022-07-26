package practice;
import java.util.Scanner;
	public class Calculator {
	    public static void main(String[] args) {
	    	double a;
	    	double b;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number 1:");
	        a = scanner.nextDouble();
	        System.out.print("Enter number 2:");
	        b = scanner.nextDouble();
	        System.out.print("Enter the operation to be performed (+,-,*,/): ");
	        char operator = scanner.next().charAt(0);
	        scanner.close();
	        double output;
	        switch(operator)
	        {
	            case'+':
	            	output=a+b;
	                break;
	            case'-':
	            	output=a-b;
	                break;
	            case'*':
	            	output=a*b;
	                break;
	            case'/':
	            	output=a/b;
	                break;
	            default:
	                System.out.printf("Enter correct operator");
	                return;
	        }
	        System.out.println(a+" "+operator+" "+b+" = "+output);
	    }
	

	}


