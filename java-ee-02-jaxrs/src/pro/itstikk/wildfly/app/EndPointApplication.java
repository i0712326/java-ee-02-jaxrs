package pro.itstikk.wildfly.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class EndPointApplication extends Application {
	public EndPointApplication() {
		super();
	}
}
