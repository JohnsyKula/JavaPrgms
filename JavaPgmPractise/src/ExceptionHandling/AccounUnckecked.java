package ExceptionHandling;

import java.util.Scanner;

public class AccounUnckecked {
	int pin;
	double balance;
	public AccounUnckecked(int pin, double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println("Enter the amount");
			double amount=sc.nextDouble();
			if(amount>balance)
			{
				throw new InsufiUnckeckedException("Low balance");
			}
			else
			{
				System.out.println("Collect your money");
				balance=balance-amount;
			}
				
		}
	}
	public static void main(String[] args)
	{
		AccounUnckecked a=new AccounUnckecked(5555,10000);
		a.withdraw();
		System.out.println("Exception Handled");
	}


}
