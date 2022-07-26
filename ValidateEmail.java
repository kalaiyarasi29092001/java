package practice;

import java.util.Scanner;


public class ValidateEmail {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			//Storing list of emailid in an array
			 String Array[]= {"kalai@gmail.com",
					          "akash@gmail.com",
					          "karthi@gmail.com",
					           "pooja@gmail.com",
					           "vikram@gmail.com",
					           };
					
			 System.out.println("Enter the EmailId");
			//Get input from user to search emailid
		   String s=sc.next();
		   //Validating email
		      
		      for(int  i=0;i<Array.length;i++)
		       {
		    	  
		       if(Array[i].equals(s))
		       {
		       
		    	   System.out.println("valid email address");
		       
		       }
		      else {
		    	  System.out.println("Invalid");
		      }
		       }
		}
}