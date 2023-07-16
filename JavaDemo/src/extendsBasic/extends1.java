package extendsBasic;

public class extends1 {

    private String getName;

    private String email;

    private String phoneNumber;
    

    public extends1(String getName) {
        System.out.println("extends1 Constructor");
        this.getName = getName;
    }

    public String getGetName() {
        return getName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "extends1 [getName=" + getName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }

    
    
}
