package person;

public class Person {
    private String personId;
    private String personName;
    private String address;
    private String birthDate;
    private String contactNumber;
    private String emailId;

    public Person() {
    }

    public Person(String personId, String personName, String address, String birthDate, String contactNumber, String emailId) {
        this.personId = personId;
        this.personName = personName;
        this.address = address;
        this.birthDate = birthDate;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }



}
