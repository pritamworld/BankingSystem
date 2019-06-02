package bank;

public class CurrentAccount extends BankAccount {

    private int withDrawalLimit;
    private int transactionCharges;



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





}
