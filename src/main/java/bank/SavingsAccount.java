package bank;

public class SavingsAccount extends BankAccount
{
    private int withdrawalLimit;
    private int transactionCharges;
    private float annualIntrestRate;



    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
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
