class ThreadSleepDemo 
{
	public static void main(String[] args) 
	{
	
		for (int i=1;i<=5;i++ )
		{
			try
			{
			Thread.sleep(2000);	
			}
			catch (InterruptedException ie)
			{
				System.out.println(ie);
			}
			
			System.out.println("main thread :"+i);
		}

	}
}
