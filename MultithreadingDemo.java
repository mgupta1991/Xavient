package mypackage;


/*By extending Thread Class....*/
/*public class MultithreadingDemo extends Thread{
	public void run()
	{
		System.out.println("Thread is running....");
	}
	
	public static void main(String[] args)
	{
		MultithreadingDemo t1 = new MultithreadingDemo();
		t1.start();
	}
}
*/


public class MultithreadingDemo implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			{
				System.out.println("Daemon Thread...");
			}
			else
			{
				System.out.println("user Thread...");
			}

		
	}
	
	public static void main(String[] args) {
		
		MultithreadingDemo m1 = new MultithreadingDemo();
		MultithreadingDemo m2 = new MultithreadingDemo();
		MultithreadingDemo m3 = new MultithreadingDemo();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		t1.setDaemon(true);
		t1.start();
		//t2.start();
		//t3.start();
		
	}
}

