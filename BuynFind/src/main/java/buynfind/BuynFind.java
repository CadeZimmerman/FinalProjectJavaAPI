/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package buynfind;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import static jakarta.ws.rs.client.Entity.html;
import static jakarta.ws.rs.client.Entity.text;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import static java.awt.SystemColor.text;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.swing.text.AbstractDocument.Content;

/**
 * REST Web Service
 *
 * @author Halom
 */
@Path("buynfind")
@RequestScoped
public class BuynFind {

    @Context
    private UriInfo context;
   
    /**
     * Creates a new instance of BuynFind
     */
    public BuynFind() {
       public user = null; 
        
        
    }

    /**
     * Retrieves representation of an instance of buynfind.BuynFind
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(text/html)
    public String getHtml() {
        return "<html><body><h1>Welcome to BuynFind.</h1><p1>What Would you like to do?</p></body></html>";
    }

    /**
     * PUT method for updating or creating an instance of BuynFind
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
    
}
