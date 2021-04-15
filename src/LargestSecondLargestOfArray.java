import java.sql.Array;
import java.util.*;
public class LargestSecondLargestOfArray 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Elements of array : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int largest=arr[0];
		int sec_largest=arr[1];
		for(int i=0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				sec_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>sec_largest && arr[i]!=largest)
			{
				sec_largest=arr[i];
			}
		}
		System.out.printf("The largest and Second Largest is : "+largest+" "+sec_largest);
	}
}
