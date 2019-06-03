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
}
