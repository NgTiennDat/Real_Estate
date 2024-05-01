package entity;

public class ContactInfo {

    private String phoneNumber;
    private String email;
    private String contactName;

    public ContactInfo(String phoneNumber, String email, String contactName) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
