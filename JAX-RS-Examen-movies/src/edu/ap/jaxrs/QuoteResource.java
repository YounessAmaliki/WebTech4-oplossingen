package edu.ap.jaxrs;

import java.io.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.json.*;

import com.mongodb.*;
import com.mongodb.jee.*;
import com.mongodb.client.*;




@Path("/")
	public class QuoteResource {

	  	@GET
	  	@Path("/findOne")
	  	@Produces(MediaType.APPLICATION_JSON)
	  	public DBObject findOne(){
	  	  DB db = Mongo.getDB("ecommerce");
	  	  DBCollection col = db.getCollection("products");
  	  return col.findOne();            
    }
	}

d
/*
@Path("/quotes")
public class QuoteResource {
	
	
	
	static final String FILE = "C:/Users/Majid0202/Desktop/WebTech4-oplossingen/JAX-RS-Examen-movies/Quotes.json";

	@GET
	@Produces({"text/html"})
	public String getProductsHTML() {
		String htmlString = "<html><body>";
		try {
			InputStream fis = new FileInputStream(FILE);
	        JsonReader reader = Json.createReader(fis);
	        JsonObject obj = reader.readObject();
	        reader.close();
	        fis.close();
	        
	        
	        JsonArray array = obj.getJsonArray("quotes");
	        for(int i = 0; i < array.size(); i++) {
	        	JsonObject obj2 = array.getJsonObject(i);
	        	htmlString += "<b>Name : " + obj2.getString("name") + "</b><br>";
	        	htmlString += "ID : " + obj2.getString("id") + "<br>";
	        	htmlString += "Brand : " + obj2.getString("brand") + "<br>";
	        	htmlString += "Description : " + obj2.getString("description") + "<br>";
	        	htmlString += "Price : " + obj2.getString("price") + "<br>";
	        	htmlString += "<br><br>";
	        }
	        
		} 
		catch (Exception ex) {
			htmlString = ex.getMessage();
		}
		return htmlString + "</body></html>";
	}
	
	@POST
	@Path("{id}")
	@Produces({"text/html"})
	public String getProductHTML(@PathParam("id") String id) {
		String htmlString = "<html><body>";
		try {
			InputStream fis = new FileInputStream(FILE);
	        JsonReader reader = Json.createReader(fis);
	        JsonObject jsonObject = reader.readObject();
	        reader.close();
	        fis.close();
	        
	        JsonArray array = jsonObject.getJsonArray("quotes");
	        for(int i = 0; i < array.size(); i++) {
	        	JsonObject obj = array.getJsonObject(i);
	        	if(obj.getString("id").equalsIgnoreCase(id)) {
	        		htmlString += "<b>Name : " + obj.getString("name") + "</b><br>";
	        		htmlString += "ID : " + obj.getString("id") + "<br>";
	        		htmlString += "Brand : " + obj.getString("brand") + "<br>";
	        		htmlString += "Description : " + obj.getString("description") + "<br>";
	        		htmlString += "Price : " + obj.getString("price") + "<br>";
	        		htmlString += "<br><br>";
	            	break;
	            }
	        }
		} 
		catch (Exception ex) {
			htmlString = ex.getMessage();
		}
		return htmlString + "</body></html>";
	}
}
*/