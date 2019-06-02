package bank;

public class SavingsAccount extends BankAccount
{
    private String personId;
    private float withdrawalLimit;
    private float transactionCharges;
    private float interestRate;
    private float insufficientFundCharges;
    private float minimumBalance = 100;


    public SavingsAccount() {
    }

    public SavingsAccount(String personId, float withdrawalLimit, float transactionCharges, float interestRate, float insufficientFundCharges, float minimumBalance) {
        this.personId = personId;
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        this.interestRate = interestRate;
        this.insufficientFundCharges = insufficientFundCharges;
        this.minimumBalance = minimumBalance;
    }

    public SavingsAccount(String accountNumber, String accountType, String bankBranch, float accountBalance, String personId, float withdrawalLimit, float transactionCharges, float interestRate, float insufficientFundCharges, float minimumBalance) {
        super(accountNumber, accountType, bankBranch, accountBalance);
        this.personId = personId;
        this.withdrawalLimit = withdrawalLimit;
        this.transactionCharges = transactionCharges;
        this.interestRate = interestRate;
        this.insufficientFundCharges = insufficientFundCharges;
        this.minimumBalance = minimumBalance;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
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
