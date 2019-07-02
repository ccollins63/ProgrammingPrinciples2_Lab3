package exercise1;

public class CheckingAccount extends Account
{
    private double overDraft = 100;

    public CheckingAccount(int id, double balance, double annualInterestRate)
    {
        super(id, balance, annualInterestRate);
    }

    public double getOverDraft()
    {
        return overDraft;
    }

    public void setOverDraft(double overDraft)
    {
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double amount)
    {
        double balance = getBalance ();

        if (balance < amount)
        {
            super.withdraw(amount + overDraft);
        }

        else
        {
            super.withdraw(amount);
        }
    }

    public String toString()
    {
        return "Account ID:\t\t\t\t" + this.getId() + "\nAccount Balance:\t\t$" + this.getBalance() + "\nOverdraft Fee:\t\t\t$" + getOverDraft() + "\nDate Opened:\t\t\t" + getDateCreated();
    }
}
