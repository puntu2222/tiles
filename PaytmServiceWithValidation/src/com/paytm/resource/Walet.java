package com.paytm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("walet")
public class Walet {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public int getBalance(@QueryParam("mobileNo")String mobileNo ) {
		int balance=0;
		if(mobileNo=="9") {
			balance=89;
		}
		return balance;
	}

}
