package person;

public class Customer extends Person{

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

}
