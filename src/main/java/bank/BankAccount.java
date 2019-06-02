package bank;

public class BankAccount {

    private String accountNumber;
    private String accountType;
    private String bankBranch;
    private float accountBalance;


    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountType, String bankBranch, float accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.bankBranch = bankBranch;
        this.accountBalance = accountBalance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

}
