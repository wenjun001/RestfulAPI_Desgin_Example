package net.example.resources;

import net.example.exception.ResourceNotFoundException;
import net.example.model.user.Education;
import net.example.model.user.User;
import net.example.model.user.UserFilter;
import net.example.services.UserService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

/**
 * Created by xiu on 9/20/16.
 */

@Path("/Users")

public class UserResource {


    UserService userService = null;
    public UserResource() {
        userService = new UserService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers(@BeanParam UserFilter userFilter,
                                  @HeaderParam("Content_type")String contentType,
                                  @CookieParam("tokenId") String tokenId,
                                  @Context UriInfo url){
        System.out.println("name:"+userFilter.getUserName()+"  contentType:"+contentType+" tokenId "+tokenId+"  url:"+url.getBaseUri());
        if(userFilter.getUserName() != null && !"".equals(userFilter.getUserName())){
            return userService.getUserByUserName(userFilter.getUserName());
        }
        return  userService.getAllUser();

    }

    @GET
    @Path("/{userId}")
    public Response getUserById(@PathParam("userId") long userId, @Context UriInfo url){

        User user = userService.getUserByUserId(userId);
        Response response = null;
        if(user == null){
            throw new ResourceNotFoundException("user not found");

        }else{

            String selfUrl = url.getBaseUriBuilder().path(UserResource.class).path(""+userId).build().toString();
            net.example.model.user.Link self = new net.example.model.user.Link("self",selfUrl);
            user.addLink(self);
            response= Response.status(Response.Status.FOUND).entity(user).build();
        }

        return response;

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed({"ADMIN"})
    public User createUser(User user){
        return userService.addUser(user);
    }

    @PUT
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User updateUser(@PathParam("userId") int userId,User user){
        user.setUserId(userId);
        return userService.updateUser(user);
    }

    @DELETE
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateUser(@PathParam("userId") int userId){
         userService.delete(userId);
    }


    @GET
    @Path("/{userId}/educations")
    public EducationResource getEducationByUser(@PathParam("userId") String userId){
        System.out.println("UserId:"+userId);
        return new EducationResource();
    }




}
