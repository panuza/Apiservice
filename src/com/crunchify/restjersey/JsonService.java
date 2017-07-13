package com.crunchify.restjersey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author Crunchify
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/film.json")
public class JsonService {

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Utills utills = new Utills();
		ArrayList<HashMap<String, String>> list = utills.getList();
		Random random = new Random();
		int index = random.nextInt(list.size());

		List<String> keys = new ArrayList<String>(list.get(index).keySet());

		jsonObject.put("Year", list.get(index).get(list.get(index).keySet().iterator().next()));
		jsonObject.put("Title", keys.iterator().next().toString().replace("\"", ""));

		String result = "The random year and title \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
}