import java.util.*;
abstract class Account
{
	private int ano;
	protected int balance;
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
	public int withdraw(int withdraw)
	{
		balance = balance-withdraw;
		return balance; 
	}
	public void display()
	{
		System.out.print("\n\t Account No : "+ano);
		System.out.print("\n\t Account Balance : "+checkBal());
	}			                                  	
}
class Saving extends Account
{
	private int roi;
	private int ano;
	public Saving(int ano,int balance,int roi)
	{
		super(ano,balance);
		this.ano = ano;
		this.roi = roi;
	}
	public void display()
	{
		super.display();
		System.out.print("\n\t Rate of Intrest : "+roi+"\n");
	}
	
}
class Current extends Account
{
	private int odl;
	private int ano;
	private int withdraw;
	private int usedodl,remainingodl;
	public Current(int ano,int balance,int odl)
	{
		super(ano,balance);
		this.ano = ano;
		this.odl = odl;
	}	
	public int withdraw(int withdraw)
	{
		if(withdraw > checkBal())
		{
			balance = balance + odl;
			super.withdraw(balance);
			return super.checkBal();
		}
		else
		{
			super.withdraw(withdraw);
			return super.checkBal();
		}
	}
	public void display()
	{
		super.display();
		System.out.print("\n\t Over draft Limit : "+odl+"\n");
		System.out.print("\n\t Used over Draft Limit : "+usedodl+"\n");
		System.out.print("\n\t Remaining over draft Limit : "+remainingodl+"\n");
	}
}
class Q9
{
	public static void main(String args[])
	{
		int ch,accountno=10101,roi = 6,odl = 50000;
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
			obj = new Saving(accountno,balance,roi);
		}
		if(temp == 2)
		{
			obj = new Current(accountno,balance,odl); 
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
						int deposit;		
						System.out.print("\n\t Please Enter the amount to deposit : ");
						deposit = Integer.parseInt(sc.nextLine());
						if(deposit < 0)
						{
							System.out.printf("\n\t Negative amount can't be deposited");
							break;
						}
						else
						{
							obj.deposit(deposit);
							System.out.print("\n\t  Amount deposited successfully\n\tyour closing balance is "+obj.checkBal());
						}
					break;
				case 2 :
						int withdraw;		
						System.out.print("\n\t Please Enter the amount to deposit : ");
						withdraw = Integer.parseInt(sc.nextLine());
						if(acctype == "Saving")
						{						
							if(withdraw > obj.checkBal())
							{
								System.out.printf("\n\t Incefficient Balance for withdraw");
								break;
							}
							else
							{
								obj.withdraw(withdraw);
								System.out.print("\n\t  Amount Withdraw successfully\n\tyour closing balance is "+obj.checkBal());
							}
						}
						else
						{					
							if(withdraw > (obj.checkBal()+odl))
							{
								System.out.printf("\n\t Incefficient Balance for withdraw");
							}
							else
							{
								obj.withdraw(withdraw);
							}		
						}
					break;
				case 3 :
						System.out.print("\n\t Balance of "+accountno+"  is "+obj.checkBal());
					break;
				case 4 :
						System.out.print("\n\t Accont Holder Name : "+name);
						obj.display();
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
