package bank;

public class CurrentAccount extends BankAccount {

    private float withdrawalLimit;
    private float transactionCharges;
    private float InterestRate;
    private float insufficientFundCharges;
    private float minimumBalance = 100;



    public CurrentAccount() {
    }

    public CurrentAccount(float withdrawalLimit, float transactionCharges, float interestRate, float insufficientFundCharges) {
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        InterestRate = interestRate;
        this.insufficientFundCharges = insufficientFundCharges;
    }

    public CurrentAccount(String accountNumber, String accountType, String bankBranch, float accountBalance, float withdrawalLimit, float transactionCharges, float interestRate, float insufficientFundCharges) {
        super(accountNumber, accountType, bankBranch, accountBalance);
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        InterestRate = interestRate;
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

    public void setTransactionCharges(int transactionCharges) {
        this.transactionCharges = transactionCharges;
    }

    public float getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(float interestRate) {
        InterestRate = interestRate;
    }

    public float getInsufficientFundCharges() {
        return insufficientFundCharges;
    }

    public void setInsufficientFundCharges(float insufficientFundCharges) {
        this.insufficientFundCharges = insufficientFundCharges;
    }
}
