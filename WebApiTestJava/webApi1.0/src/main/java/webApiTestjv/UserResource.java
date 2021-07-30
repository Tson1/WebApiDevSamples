package webApiTestjv;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import webApiTestjv.models.User;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("userresource")
//@Slf4j
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getJson()
    {
    	User info =new User();
    	info.setName("test");
    	info.setAge(10);
    	return info;
    }
}
