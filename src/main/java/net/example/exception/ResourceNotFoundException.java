package net.example.exception;

import javax.ws.rs.ext.Provider;

/**
 * Created by xiu on 9/20/16.
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String  message) {
        super(message);
    }

}
