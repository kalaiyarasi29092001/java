package method;

class DefaultAcc {
	void display()
	{
   System.out.println("you are using default access specifier");
}
}
 public class accessSpecifiers1{
	 public static void main (String[] args ) {
		 System.out.println(" This is a default access specifier");
		 DefaultAcc obj=new DefaultAcc();
		 obj.display();
	 }
 }




