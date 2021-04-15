import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		sc.close();
		int i=1;
		new PerfectNumber().Perfect(num, i);
		
		if(sum==num)
		{
			System.out.println("This is a Perfect Number");
		}
		else
		{
			System.out.println("This is not a Perfect Number");
		}
	}
	
	static int sum=0;
	
	private int Perfect(int num, int i) {

		
		if(i<num)
		{
			if(num%i==0)
		    	sum=sum+i;
			Perfect(num, i+1);
		}
		return sum;
	}
	
	
//	private int Perfect(int num, int i) {
//	  while(i<num)
//	  {
//		     if(num%i==0)
//		    	sum=sum+i;
//		    i++;
//	  }
//	  return sum;
//	}
	
}
 

