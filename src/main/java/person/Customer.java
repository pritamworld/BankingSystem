package person;
import bank.BankAccount;

import bank.BankAccount;

public class Customer extends Person{

    private String photoAddressProofId;

    public Customer() {

    }

    public Customer(String photoAddressProofId) {
        this.photoAddressProofId = photoAddressProofId;
    }

    public Customer(String personId, String personName, String address, String birthDate, String contactNumber, String emailId, String photoAddressProofId) {
        super(personId, personName, address, birthDate, contactNumber, emailId);
        this.photoAddressProofId = photoAddressProofId;
    }
}
