import java.util.*;
class Even extends RuntimeException
{
	
}
public class CustomException_Example
{
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Number...");
			int num=sc.nextInt();
			if (num%2==0) 
			{
				Even e=new Even();
				try
				{
					throw e;
				}
				catch (Even e1) 
				{
					System.out.println("User-Defined Exception Handled");
					e1.printStackTrace();
				}
			}
			else
				System.out.println("Odd Number");
		}
		catch (Exception e) {
			System.out.println("Handled by Super-Class");
			e.printStackTrace();
		}
		System.out.println("Terminates Normally");
	}
}
