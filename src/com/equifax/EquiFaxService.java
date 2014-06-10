package com.equifax;


import javax.ws.rs.*;



public class EquiFaxService {
	
	@POST
    @Path("/getbook/{name}")
    @Produces({"application/xml","application/json"})
    @Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
    public String getEquiFaxData(){
		return null;
	}
	

}
