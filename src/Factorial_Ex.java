import java.util.Scanner;

public class Factorial_Ex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Factorial nummber of  "+n+" is : "+new Factorial_Ex().fact(n));
	}

//	private int fact(int n) {
//		int f=1;
//		for(int i=1; i<=n; i++)
//		{
//			f=f*i;
//		}
//		return f;
//		
//	}
	
	//Recursive Method
	
	private int fact(int n) {
		if(n==0)
		{
			return 1;
		}
		return (n*fact(n-1));
	}
}
