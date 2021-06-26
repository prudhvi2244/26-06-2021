public class MyThread1 extends Thread
{
	public void run()
	{
	
		for (int i=1;i<=8;i++ )
		{
			System.out.println("child thread");
		}
		
	
	}
}