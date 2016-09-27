package net.example.model.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiu on 9/20/16.
 */
public class User {

    private String userName;
    private int userId;



    public void setOthers(List<Link> others) {
        this.others = others;
    }

    public List<Link> getOthers() {
        return others;
    }

    private List<Link> others = new ArrayList<>();

    public User() {
    }

    private List<Email> emailList;
    private Address address;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId == user.userId) {

            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + userId;
        result = 31 * result + (emailList != null ? emailList.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public void addLink(Link link){
        others.add(link);
    }
}
