package pro.itstikk.wildfly.user;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpa.model.User;

@Path("/user")
@RolesAllowed({"operator"})
public interface UserCrud {
	@Path("/save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(User user);
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers();
}
