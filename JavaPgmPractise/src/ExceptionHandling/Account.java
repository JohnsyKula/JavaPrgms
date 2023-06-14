package ExceptionHandling;

import java.util.Scanner;

public class Account {
	int pin;
	double balance;
	public Account(int pin, double balance)
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
			try {
			if(amount>balance)
			{
				throw new InsufficientFundException("Low balance");
			}
			else
			{
				System.out.println("Collect your money");
				balance=balance-amount;
			}
			}
			catch(InsufficientFundException e)
			{
				System.out.println(e.getMessage());
			}
				
		}
	}
	public static void main(String[] args)
	{
		Account a=new Account(5555,10000);
		a.withdraw();
		System.out.println("Exception Handled");
	}

}
