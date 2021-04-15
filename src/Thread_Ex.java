public class Thread_Ex extends Thread
{
	public void run()
	{
		System.out.println("Hello"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Java");
		System.out.println("Simple");
		Thread_Ex t=new Thread_Ex();
		t.start();
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Hi");
		}
	}
}
