package net.example;

/**
 * Created by xiu on 9/21/16.
 */
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;


public class ApplicationResourceConfig extends ResourceConfig{
    public ApplicationResourceConfig() {
        register(RolesAllowedDynamicFeature.class);
    }
}