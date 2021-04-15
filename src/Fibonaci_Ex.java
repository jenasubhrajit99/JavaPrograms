import java.util.Scanner;

public class Fibonaci_Ex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(new Fibonaci_Ex(). fibo(n)); 
	}

	private int fibo(int n) {
		if(n<1)
		{
			return n;
		}
		else if(n==1 || n==2)
		{
			return n-1;
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	
}
