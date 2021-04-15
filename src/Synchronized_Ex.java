class Display{
	public /* static synchronized */void wish(String name)
	{
		synchronized(/*this*/ Display.class) {
			for(int i=0; i<10; i++)
			{
				System.out.println("Good Morning");
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {}
				System.out.println(name);
			}
		}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class Synchronized_Ex {
	public static void main(String[] args) {
		Display d= new Display();
		Display d1=new Display();
		MyThread t=new MyThread(d, "Dhoni");
		MyThread t1=new MyThread(d1, "Jeet");
		//MyThread t2=new MyThread(d1, "Kohli");
		t.start();
		t1.start();
		//t2.start();
	}
}
