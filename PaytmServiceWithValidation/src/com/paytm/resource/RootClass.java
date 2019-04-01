package com.paytm.resource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("service")
public class RootClass extends Application{
	protected Set<Object> singleton;
	protected Set<Class<?>> classes;
	public RootClass() {
		singleton=new HashSet<>();
		classes=new HashSet<>();
		singleton.add(new Walet());
	}
	public Set<Object> getSingleton() {
		return singleton;
	}
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	
	

}
