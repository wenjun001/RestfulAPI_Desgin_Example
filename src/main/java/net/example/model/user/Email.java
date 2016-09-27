package net.example.model.user;

/**
 * Created by xiu on 9/20/16.
 */
public class Email {

    private String email;
    private boolean isPrimary = false;

    public Email() {
    }

    public Email(String email, boolean isPrimary) {
        this.email = email;
        this.isPrimary = isPrimary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }
}
