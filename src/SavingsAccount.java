
public class SavingsAccount extends BankAccount {

    private double rate = 0.25;
    private int savingNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double begBal) {
        super(name, begBal);
        accountNumber = super.getAccountNumber() + "-" + savingNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double begBal)

    {
        super(oldAccount, begBal);
        savingNumber = oldAccount.savingNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingNumber;
    }

    public void postInterest() {
        double newBalance = getBalance() * (1 + rate / 12);
        setBalance(newBalance);
    }

    public String AccountNumber() {
        return accountNumber;
    }

}
