package net.example.exception;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by xiu on 9/21/16.
 */
@Provider
public class URLNotFoundExcMapper implements ExceptionMapper<NotFoundException> {
    @Override
    public Response toResponse(NotFoundException e) {
        e.printStackTrace();
        System.out.println("not found");
        ErrorMessage errorMessage = new ErrorMessage(-2,"URL is not correct contact www.aaa.html");
        //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
        return Response.status(Response.Status.NOT_FOUND).type(MediaType.APPLICATION_JSON).entity(errorMessage).build();
    }
}
