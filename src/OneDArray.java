import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			sum=a[i];
			if(sum<0)
			{
				count++;
			}
			for(int j=i+1; j<a.length; j++)
			{
				sum=sum+a[j];
				if(sum<0)
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}
