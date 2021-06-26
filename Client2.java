class Client2 
{
	public static void main(String[] args) 
	{
		MyThread2 obj=new MyThread2();
		Thread t=new Thread(obj);
		t.start();
		
		for (int i=1;i<=20;i++ )
		{
			System.out.println("main thread");
		}
	}
}
