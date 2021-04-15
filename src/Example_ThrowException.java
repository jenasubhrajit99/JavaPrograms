
public class Example_ThrowException 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		try
		{
			throw new ArithmeticException();
		}
		catch (Exception e) 
		{
			System.out.println("Caught.........");
		}
		System.out.println("Terminates Normally");
	}

}
