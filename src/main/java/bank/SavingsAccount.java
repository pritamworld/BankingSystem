package bank;

public class SavingsAccount
{
    private String accountNumber;
    private int withdrawalLimit;
    private float balance;
    private int transactionCharges;
    private float annualIntrestRate;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getTransactionCharges() {
        return transactionCharges;
    }

    public void setTransactionCharges(int transactionCharges) {
        this.transactionCharges = transactionCharges;
    }

    public float getAnnualIntrestRate() {
        return annualIntrestRate;
    }

    public void setAnnualIntrestRate(float annualIntrestRate) {
        this.annualIntrestRate = annualIntrestRate;
    }
}
