import java.util.Scanner;
class MyCalculator {

	public long power(int n, int p) throws Exception  {
		int result=1;
		if(n<0||p<0)
		{
			throw new Exception("n or p should not be negative.");
		}
		if(n==0 && p==0)
		{
			throw new Exception("n and p should not be zero.");
		}
		else {
			for(int i=1; i<=p; i++)
			{
				result=result*n;
			}
			return result;
		}
	}
    
}

public class Power_Exception_Ex {
    public static void main(String[] args) {
    	MyCalculator my_calculator = new MyCalculator();
    	Scanner in = new Scanner(System.in);
    		System.out.println("Enter the number : ");
            int n = in .nextInt();
            System.out.println("Enter the Power : ");
            int p = in .nextInt();
            
            try {
                System.out.println("The result is : "+my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}