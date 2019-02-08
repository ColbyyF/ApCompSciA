public class Account
{
private double balance;
private String name;
private int acctNum;
//----------------------------------------------
//Constructor -- initializes balance, owner, and account number
//----------------------------------------------
public Account(double initBal, String owner, int number)
{
balance = initBal;
name = owner;
acctNum = number;
}
//----------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//----------------------------------------------
public void withdraw(double amount)
{
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
}
//----------------------------------------------
// Adds deposit amount to balance.
//----------------------------------------------
public void deposit(double amount)
{
balance += amount;
}
//----------------------------------------------
// Returns balance.
//----------------------------------------------
public double getBalance()
{
return balance;
}
//----------------------------------------------
// Returns account name.
//----------------------------------------------
public String getName()
{
return name;
}
}