package webApiTestjv;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

// 不推荐 ：最好分开文件，用默认路径    
//    @Path("/user")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public User getJson()
//    {
//    	User info =new User();
//    	info.setName("test");
//    	info.setAge(10);
//    	return info;
//    }
}
