package net.example.model.user;

/**
 * Created by xiu on 9/20/16.
 */
public class Address {

    private String address1;
    private String address2;
    private String state;
    private String zipCode;

    public Address() {
    }

    public Address(String address1, String address2, String state, String zipCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
