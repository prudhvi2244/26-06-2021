class MyThread2 implements Runnable
{
	public void run()
	{
		for (int i=1;i<=10;i++ )
		{
			System.out.println("run() method from MyThread2");
		}
		
	}
}
