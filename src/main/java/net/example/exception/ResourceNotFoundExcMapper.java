package net.example.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by xiu on 9/20/16.
 */
@Provider
public class ResourceNotFoundExcMapper implements ExceptionMapper<ResourceNotFoundException> {
    @Override
    public Response toResponse(ResourceNotFoundException throwable) {
        ErrorMessage errorMessage = new ErrorMessage(1,"No Found");
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
