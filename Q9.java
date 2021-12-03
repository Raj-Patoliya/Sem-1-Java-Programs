import java.util.*;
class Account
{
	private int ano;
	private int balance;
	{
		balance = 0;	
	}
	public Account(int ano,int balance)
	{
		this.ano = ano;
		this.balance = balance;
	}
	public int checkBal()
	{
		return balance;
	}
	public void deposit(int deposit)
	{
		balance = balance + deposit;	
	}			                                  	
}
class Saving extends Account
{
	public Saving(int ano,int balance)
	{
		super(ano,balance);
	}	
}
class Current extends Account
{
	public Current(int ano,int balance)
	{
		super(ano,balance);
	}
}
class Q9
{
	public static void main(String args[])
	{
		int ch;
		String acctype;
		int temp=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tCreate your Account.");
		System.out.print("\n\tEnter your Name : ");
		String name = sc.nextLine();	
		System.out.print("\n\t:: Select your account Type :: ");
		System.out.print("\n\tPress 1 for Saving ");
		System.out.print("\n\tPress 2 For Current ");

		temp = Integer.parseInt(sc.nextLine());
		System.out.print("\n\t"+temp);
		if(temp == 1)
		{
			acctype = "Saving";
		}	
		else if(temp == 2)
		{
			acctype = "Current";
		}
		else
		{
			System.out.print("\n\t Please Fill information carefully");			
			System.out.print("\n\t Please try it again....");				
			return;
		}

		System.out.print("\n\tEnter opening balance : ");
		int balance = Integer.parseInt(sc.nextLine());
		Account obj=null;
		if(temp == 1)
		{
			obj = new Saving(10101,balance);
		}
		if(temp == 2)
		{
			obj = new Current(10101,balance); 
		}
		do{
			System.out.print("\n\t1.Deposit.");
			System.out.print("\n\t2.Withdraw.");
			System.out.print("\n\t3.Check Balance.");
			System.out.print("\n\t4.Check Account infromation.");
			System.out.print("\n\t0. Exit ");
			System.out.print("\n\tPlease Enter your choice : ");
			ch = Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1 :
					System.out.print("\n\t Please Enter the amount to deposit : ");
					int deposit = Integer.parseInt(sc.nextLine());
					obj.deposit(deposit);
					System.out.print("\n\t  Amount deposited successfully\n\tyour closing balance is "+obj.checkBal());
					break;
				case 2 :
					break;
				case 3 :
					break;
				case 4 :
					break;
				case 0 :
					break;
				default :
					System.out.print("\n\t Please enter proper choice");
					break;
			}
		}while(ch!=0);
	}
}
