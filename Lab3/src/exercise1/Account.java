package exercise1;

import java.util.Date;

public class Account
{
    private int id                    = 0;
    private double balance            = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account(int id, double balance)
    {
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id                 = id;
        this.balance            = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated             = new Date();
    }

    public int getId()
    {
        return this.id;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    Date getDateCreated()
    {
        return dateCreated;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    double getMonthlyInterestRate()
    {
        return this.annualInterestRate / 12.0;
    }

    double getMonthlyInterest()
    {
        double monthlyInterestRate = this.getMonthlyInterestRate();
        return this.balance * monthlyInterestRate;
    }

    void withdraw(double amount)
    {
        this.balance -= amount;
    }

    void deposit(double amount)
    {
       this.balance += amount;
    }

    public String toString()
    {
        return "Account ID:\t\t\t\t" + this.getId() + "\nAccount Balance:\t\t$" + this.getBalance() + "\nInterest Rate:\t\t\t" + this.getAnnualInterestRate() * 100.0 + "%\nDate Opened:\t\t\t" + getDateCreated();
    }
}
