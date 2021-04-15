class A
{
	public  void d1(B b)
	{
		System.out.println("Thread 1 Starts Exicution of d1() method");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 1 trying to call B's last()");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A, this is last() method");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread 2 starts exicution of d2() method");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e){}
		System.out.println("Thread 2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, last() method");
	}
}

public class DeadLock_Ex extends Thread{
	A a=new A();
	B b=new B();
	private void m1() {
		this.start();
		a.d1(b);// This line exicuted by main thread
	}
	public void run() {
		b.d2(a);// This line exicuted by child thread
	}
	public static void main(String[] args) {
		DeadLock_Ex t=new DeadLock_Ex();
		t.m1();
	}
}
