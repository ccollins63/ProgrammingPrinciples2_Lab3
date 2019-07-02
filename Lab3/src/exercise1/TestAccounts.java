package exercise1;

public class TestAccounts
{
    public static void main(String args[])
    {
        Account account                 = new Account(999, 10000, 0.02);
        CheckingAccount checkingAccount = new CheckingAccount (998, 2000, 0);
        SavingsAccount savingsAccount   = new SavingsAccount(997, 30000, 0.03);

        System.out.println(account);
        System.out.println("________________________________________________________________________");
        System.out.println(checkingAccount);
        checkingAccount.withdraw(2050);
        System.out.println("New Balance:\t\t\t$" + checkingAccount.getBalance());
        System.out.println("________________________________________________________________________");
        System.out.println(savingsAccount);
        System.out.println("________________________________________________________________________");
    }
}
