package methodexecution;

public class MethodExecution {
	public int multiply(int a,int b) {
		int z=a*b;
		return z;
	}
	
	public static void main (String[] args) {
		MethodExecution obj= new MethodExecution ();
		int ans= obj.multiply(10,5);
		System.out.println("Multiplication is:"+ans);

}
}
