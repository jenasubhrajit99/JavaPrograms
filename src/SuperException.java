public class SuperException
{
	public static void main(String[] args) {
		System.out.println("hello");
		try
		{
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}
		/*catch(ArrayIndexOutOfBoundsException s)
		{
			System.out.println("Enter the value from Command line");
		}*/
		catch(Exception e)
		{
			System.out.println("Handlled by Super class");
			System.out.println(e.getMessage());//Why Exception occurs
			System.out.println(e);//Name Of the exception
			e.printStackTrace();//Details About exception

		}
		System.out.println("Terminates Normally");
	}
}