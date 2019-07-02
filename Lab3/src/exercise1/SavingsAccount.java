package exercise1;

public class SavingsAccount extends Account
{
    public SavingsAccount(int id, double balance, double annualInterestRate)
    {
        super(id, balance, annualInterestRate);
    }

    public String toString()
    {
        return "Account ID:\t\t\t\t" + this.getId() + "\nAccount Balance:\t\t$" + this.getBalance() + "\nInterest Rate:\t\t\t" + this.getAnnualInterestRate() * 100.0 + "%\nDate Opened:\t\t\t" + getDateCreated();
    }
}
