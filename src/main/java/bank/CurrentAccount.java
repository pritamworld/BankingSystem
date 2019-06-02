package bank;

public class CurrentAccount extends BankAccount {

    private int withDrawalLimit;
    private int transactionCharges;
    private int insufficentFundCharges;
    private float intrestRate;

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
