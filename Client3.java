class Client3 
{
	public static void main(String[] args) 
	{
		System.out.println("Name of main Thread:"+Thread.currentThread().getName());
		Thread.currentThread().setName("5sha");
		System.out.println("Name of main Thread:"+Thread.currentThread().getName());
	}
}
