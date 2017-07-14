package com.crunchify.restjersey;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;


@Path("/film.html")

public class HtmlService {
	
	@GET
	@Produces("text/html")
	public void   test(@Context ServletContext context,
	        @Context HttpServletRequest request,
	        @Context HttpServletResponse response) throws URISyntaxException, ServletException, IOException {
	
			 
				Utills utills = new Utills();
				ArrayList<HashMap<String, String>> list = utills.getList();
				Random random = new Random();
				int index = random.nextInt(list.size());

				List<String> keys = new ArrayList<String>(list.get(index).keySet());
			        
		    //  String myJsfPage ="../NewFile.html";
		        //response.getWriter().print("Year: " +list.get(index).get(list.get(index).keySet().iterator().next())  + " Title :"  +keys.iterator().next().toString().replace("\"", ""));
	        request.setAttribute("year",list.get(index).get(list.get(index).keySet().iterator().next()) ); 
	        request.setAttribute("title",list.get(index).get(list.get(index).keySet().iterator().next()) ); 
		        
//				response.sendRedirect("/NewFile.html");
		        
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/NewFile.jsp");

				rd.forward(request, response);	
				
	
		
	}
	
}