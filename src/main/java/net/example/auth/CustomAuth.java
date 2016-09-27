package net.example.auth;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by xiu on 9/21/16.
 */
@Provider
@Priority(Priorities.AUTHENTICATION)
public class CustomAuth implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {

        System.out.println("I am in filter");
        containerRequestContext.setSecurityContext(new TokenBasedSecurityContext());

    }
}
