/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecBin;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Gustavo
 */
@Stateless
@Path("/DecBin")
public class GenericResource {
    static DecimalBinario Dbin;
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String Conversion(@QueryParam("num") int num) {
        DecimalBinario bin = new DecimalBinario();          
        return bin.DecBin(num);        
    }   
    public String DecBin(int num) {     
        String base2="";        
        while(num>0) {
            base2=(num%2)+base2;
            num/=2;  
        }     
        return base2;    
    }
}
