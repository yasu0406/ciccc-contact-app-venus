public class Contact {

    private String userName;
    private String email;
    private String street;
    private int sin;
    private int[] celphone;

    // Constructor
    public Contact(String userName, String email, String street, int sin, int[] celphone) {
        this.userName = userName;
        this.email = email;
        this.street = street;
        this.sin = sin;
        this.celphone = celphone;
    }



    // Getter / Setter


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getSin() {
        return sin;
    }

    public void setSin(int sin) {
        this.sin = sin;
    }

    public int[] getCelphone() {
        return celphone;
    }

    public void setCelphone(int[] celphone) {
        this.celphone = celphone;
    }
}
