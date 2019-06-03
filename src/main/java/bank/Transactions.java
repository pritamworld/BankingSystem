package bank;

import java.util.Date;

public class Transactions {
    private String beneficiaryAccountNumber;
    private String payerAccountNumber;
    private float amount;
    private Date date;

    public Transactions() {
    }

    public Transactions(String beneficiaryAccountNumber, String payerAccountNumber, float amount, Date date) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
        this.payerAccountNumber = payerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public String getBeneficiaryAccountNumber() {
        return beneficiaryAccountNumber;
    }

    public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    }

    public String getPayerAccountNumber() {
        return payerAccountNumber;
    }

    public void setPayerAccountNumber(String payerAccountNumber) {
        this.payerAccountNumber = payerAccountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
