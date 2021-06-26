public class Client1 
{
	public static void main(String[] args) 
	{
		MyThread1 mt1=new MyThread1();
		mt1.start();

		for (int i=1;i<=18;i++ )
		{
			System.out.println("main() Thread");
		}
		
	}
}
