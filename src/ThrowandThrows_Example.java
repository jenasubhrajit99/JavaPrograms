public class ThrowandThrows_Example 
{
	void show() throws Exception
	{
		System.out.println("Show().............");
		throw new Exception();
	}
	void display() throws Exception
	{
		System.out.println("display()............");
		show();
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		try 
		{ 
			new ThrowandThrows_Example().display(); 
		}
		catch (Exception e) 
		{
		  System.out.println("Exception Handeled by Caller........"); 
		}
		 
		System.out.println("Terminates Normally");
	}
}
