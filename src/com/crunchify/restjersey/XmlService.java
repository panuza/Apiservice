package com.crunchify.restjersey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/film.xml")
public class XmlService {
	
	@GET
	@Produces("application/json")
	public Response convertCtoFfromInput() {
		Utills utills = new Utills();
		ArrayList<HashMap<String, String>> list = utills.getList();
		Random random = new Random();
		int index = random.nextInt(list.size());

		List<String> keys = new ArrayList<String>(list.get(index).keySet());
		
		return Response.status(200).entity( "<XmlService>" + "<Year>" + list.get(index).get(list.get(index).keySet().iterator().next()) + "</Year> \n" + "<Title>" +  keys.iterator().next().toString().replace("\"", "") 
				+ "</Title>" + "</XmlService>").build();
	}
}
