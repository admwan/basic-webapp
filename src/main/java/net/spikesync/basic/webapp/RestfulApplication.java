package net.spikesync.basic.webapp;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class RestfulApplication extends ResourceConfig {

	public RestfulApplication() {

		packages(TestResource.class.getPackage().getName());
	}
}
