public class Recursion_Ex
{
	int foo(int n)
	{
		if (n<1) {
			return n;
		}
		else
		{
			foo(n-1);
			System.out.println("Hello World" + n);
		}
		return n;
	}
	public static void main(String[] args) {
		Recursion_Ex re= new Recursion_Ex();
		re.foo(3);
	}
}