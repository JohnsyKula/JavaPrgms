package ExceptionHandling;

public class Sample {
	static int a=10;
	public static void main(String[] args)
	{
		System.out.println("Starts Execution");
		try {
		test();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			 System.out.println("Exception handled");
		}
	}
	public static void test()
	{
	 System.out.println("Now inside called block");	
     System.out.println(a/0);
	
	}

}
