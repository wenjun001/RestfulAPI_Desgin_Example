package net.example.resources;



import javax.ws.rs.*;


/**
 * Created by xiu on 9/20/16.
 */

@Path("/")

public class EducationResource {
    @Path("/{value}")
    @GET
    public String getEducation() {
        System.out.println("PPP");
        return "aaa";
    }


}
