package bank;

public class CurrentAccount {

    private String accountNumber;
    private float balance;
    private int withDrawalLimit;
    private int transactionCharges;
    private int insufficentFundCharges;
    private float intrestRate;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getWithDrawalLimit() {
        return withDrawalLimit;
    }

    public void setWithDrawalLimit(int withDrawalLimit) {
        this.withDrawalLimit = withDrawalLimit;
    }

    public int getTransactionCharges() {
        return transactionCharges;
    }

    public void setTransactionCharges(int transactionCharges) {
        this.transactionCharges = transactionCharges;
    }

    public int getInsufficentFundCharges() {
        return insufficentFundCharges;
    }

    public void setInsufficentFundCharges(int insufficentFundCharges) {
        this.insufficentFundCharges = insufficentFundCharges;
    }

    public float getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(float intrestRate) {
        this.intrestRate = intrestRate;
    }
}
