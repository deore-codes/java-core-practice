package day01.oops;

public class BankAccount 
{

	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber , String name , double balance)
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Deposited : "+ amount);
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrawn : "+amount);
		}
		else
		{
			System.out.println("Insuficient balance ");
		}
	}
	
	public void displayBalance()
	{
		System.out.println("Balance : "+ balance);
	}
	
	
	public static void main(String[] args)
	{
		BankAccount acc = new BankAccount(101,"Snadesh Deore",10000);
		
		acc.deposit(10000);
		acc.withdraw(25000);;
		acc.displayBalance();
	}

}
