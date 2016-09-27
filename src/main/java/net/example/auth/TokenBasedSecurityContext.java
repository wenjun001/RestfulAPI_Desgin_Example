package net.example.auth;

import javax.inject.Singleton;
import javax.ws.rs.core.SecurityContext;
import java.io.Serializable;
import java.security.Principal;

/**
 * Created by xiu on 9/21/16.
 */


public class TokenBasedSecurityContext implements SecurityContext, Serializable {
    @Override
    public Principal getUserPrincipal() {
        return null;
    }

    @Override
    public boolean isUserInRole(String s) {
        System.out.println("role is:"+s);
        if("ADMIN".equals(s)) return true;
        return false;
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public String getAuthenticationScheme() {
        return null;
    }
}
