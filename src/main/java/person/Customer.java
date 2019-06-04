package person;

import java.util.ArrayList;

public class Customer extends Person implements IDisplay {

    private String photoAddressProofId;
    public Customer() {

    }

    public Customer(String personId, String personName, String address, String birthDate, String contactNumber, String emailId, String photoAddressProofId) {
        super(personId, personName, address, birthDate, contactNumber, emailId);
        this.photoAddressProofId = photoAddressProofId;
    }

    public String getPhotoAddressProofId() {
        return photoAddressProofId;
    }

    public void setPhotoAddressProofId(String photoAddressProofId) {
        this.photoAddressProofId = photoAddressProofId;
    }

    @Override
    public void displayCustomerData(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Customer Details");
            System.out.println("Customer ID : " + customers.get(i).getPersonId());
            System.out.println("Customer Name : " + customers.get(i).getPersonName());
            System.out.println("Customer Address : " + customers.get(i).getAddress());
            System.out.println("Customer Date of Birth : " + customers.get(i).getBirthDate());
            System.out.println("Customer Contact Number : " + customers.get(i).getContactNumber());
            System.out.println("Customer Email ID : " + customers.get(i).getEmailId());
            System.out.println("Customer ID Proof Number : " + customers.get(i).getPhotoAddressProofId());
            System.out.println("-------------------------------------------------------");
        }
    }
}
