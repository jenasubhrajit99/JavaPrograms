class MyThread1 extends Thread{
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {	}
		}
	}
}
public class Daemon_Ex {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().isDaemon());//java.lang.IllegalThreadStateException
//		Thread.currentThread().setDaemon(true);
//		MyThread1 t = new MyThread1();
//		System.out.println(t.isDaemon());
//		t.setDaemon(true);
//		System.out.println(t.isDaemon());
		MyThread1 t=new MyThread1();
		t.setDaemon(true);
		t.start();
		System.out.println("End of Main method");
	}
}
