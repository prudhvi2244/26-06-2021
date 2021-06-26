class BoyFriendThread  extends Thread
{
	public void run()
	{
		
		try
		{
			Thread.currentThread().join(3000);	
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println("I am waiting for you in class room");
		
	}
}
