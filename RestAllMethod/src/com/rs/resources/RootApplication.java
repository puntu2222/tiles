package com.rs.resources;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("services")
public class RootApplication extends Application{
	private Set<Object>singleton;
	private Set<Class<?>>classes;
	public RootApplication(Set<Object> singleton, Set<Class<?>> classes) {
		this.singleton = singleton;
		this.classes = classes;
		singleton.add(new NetBanking());
	}
	public Set<Object> getSingleton() {
		return singleton;
	}
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	
	

}
