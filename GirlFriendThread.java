class GirlFriendThread 
{
	public static void main(String[] args) 
	{
		BoyFriendThread t=new BoyFriendThread();
		t.start();
				
		Thread.currentThread().setName("Girl Firend Thread");
		System.out.println(Thread.currentThread().getName()+" Will you Join Java Programming?");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println("Sorry , I Cannot join now,already joined in python");
	}
}
