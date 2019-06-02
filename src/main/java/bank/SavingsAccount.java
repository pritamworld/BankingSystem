package bank;

public class SavingsAccount extends BankAccount
{
    private float withdrawalLimit;
    private float transactionCharges;
    private float interestRate;
    private float insufficientFundCharges;
    private float minimumBalance = 100;


    public SavingsAccount() {
    }

    public SavingsAccount(int withdrawalLimit, int transactionCharges, float interestRate, float insufficientFundCharges) {
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        this.interestRate = interestRate;
        this.insufficientFundCharges = insufficientFundCharges;
    }

    public SavingsAccount(String accountNumber, String accountType, String bankBranch, float accountBalance, float withdrawalLimit, float transactionCharges, float interestRate, float insufficientFundCharges) {
        super(accountNumber, accountType, bankBranch, accountBalance);
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        this.interestRate = interestRate;
        this.insufficientFundCharges = insufficientFundCharges;
    }

    public float getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(float withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public float getTransactionCharges() {
        return transactionCharges;
    }

    public void setTransactionCharges(float transactionCharges) {
        this.transactionCharges = transactionCharges;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInsufficientFundCharges() {
        return insufficientFundCharges;
    }

    public void setInsufficientFundCharges(float insufficientFundCharges) {
        this.insufficientFundCharges = insufficientFundCharges;
    }
}
