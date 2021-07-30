package WebApi2;

import WebApi2.models.User;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("userresource")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WebApi2.models.User getJson()
    {
    	User info =new User();
    	info.setName("test");
    	info.setAge(10);
    	return info;
    }
}
