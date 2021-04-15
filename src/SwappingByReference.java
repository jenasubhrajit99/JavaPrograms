public class SwappingByReference 
{
	void Swapping(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
		System.out.println("a= "+a+" "+"b= "+b);
	}
	void Swapp(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a= "+a+" "+"b= "+b);
	}
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		SwappingByReference sbr = new SwappingByReference();
		sbr.Swapp(a, b);
	}
}
