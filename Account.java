package accountcreation;

    class Account {
	private long accNum;
	protected double balance;
	public String accholder;
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{
	   balance=balance-amount;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
class Person extends Account{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
}


class Savingsaccount extends Person
{
	final double minbalance=500;
	@Override
    public void withdraw(double amount)
    {
    	if(amount>minbalance)
    	{
    	  balance=balance-amount;
    	}
    	else
    	{
    		System.out.println("min balance should be maintained");
    	}
    }
	
}
class Currentaccount extends Savingsaccount
{
	double overdraftlimit=4000;
	@Override
	public void withdraw(double amount)
	{
		if(amount<overdraftlimit)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Overdraftlimit is reached");
		}
		
	}
}
 class Banking
{
	public static void main(String[] args)
	{
	Currentaccount  a = new Currentaccount();
		a.setName("smith");
		a.setAge(56);
		System.out.println("name of account holder:"+a.getName());
		System.out.println("age of account holder:"+a.getAge());
		a.setAccNum(12345);
		System.out.println("account no:"+a.getAccNum());
		a.setBalance(2000);
		System.out.println("initial bank amount:"+a.getBalance());
		a.deposit(2000);
		System.out.println("updated amount:"+a.getBalance());
		a.setName("kathy");
		a.setAge(25);
		System.out.println("name of account holder:"+a.getName());
		System.out.println("age of account holder:"+a.getAge());
		a.setAccNum(12346);
		System.out.println("account no:"+a.getAccNum());
		a.setBalance(3000);
		System.out.println("initial bank amount:"+a.getBalance());
		a.withdraw(2000);
		System.out.println("updated amount:"+a.getBalance());
	}
}