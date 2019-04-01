package com.rs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("bank")
public class NetBanking {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getBalance(@QueryParam("mobileNo")String mobileNo) {
		
		return 88.8;
	}

}
