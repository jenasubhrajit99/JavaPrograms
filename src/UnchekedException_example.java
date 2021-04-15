public class UnchekedException_example 
{
	void show()
	{
		System.out.println("show()..........");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			new UnchekedException_example().show();
		}
		catch (Exception e) {
			System.out.println("Handeled by Caller");
		}
		System.out.println("Hi");
	}
}
