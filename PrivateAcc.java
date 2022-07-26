package method;

public class PrivateAcc {
	class DefaultAcc {
		void display()
		{
	   System.out.println("you are using private access specifier");
	}
	}
	 public class accessSpecifiers1{
		 public static void main (String[] args ) {
			 System.out.println(" This is a private access specifier");
			 PrivateAcc obj=new PrivateAcc();
			 
		 }
	 }

}
