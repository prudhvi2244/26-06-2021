import java.util.Scanner;
class AmountWithdrawDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount:");
		int amount=sc.nextInt();
		System.out.println("Please wait while Transaction is being processed");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		System.out.println("Please Collect Your Cash,Thank You");
	}
}
