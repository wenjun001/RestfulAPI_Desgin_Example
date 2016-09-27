package net.example.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by xiu on 9/20/16.
 */
@Provider
public class GeneralExceptionMapper implements ExceptionMapper<Throwable>{
    @Override
    public Response toResponse(Throwable throwable) {
        throwable.printStackTrace();
        System.out.println("Intern error");
        ErrorMessage errorMessage = new ErrorMessage(-1,"internal error contact admin please api url ");
        //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(errorMessage).build();
    }
}
