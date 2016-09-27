package net.example.model.user;

import javax.ws.rs.QueryParam;

/**
 * Created by xiu on 9/20/16.
 */
public class UserFilter {
    @QueryParam("userId") int userId;
    @QueryParam("userName") String userName;

    public UserFilter(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public UserFilter() {
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
}
