package pro.itstikk.wildfly.user;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.ejb.crud.UserEjb;
import com.jpa.model.User;
@Named
@RequestScoped
public class UserCrudImp implements UserCrud {
	@EJB
	private UserEjb userEjb;
	
	@Override
	public void save(User user) {
		userEjb.save(user);
	}
	
	@Override
	public List<User> getUsers() {
		return userEjb.getUsers();
	}

}
