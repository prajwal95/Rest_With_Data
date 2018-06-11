/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee;

import com.mycompany.employee.model.Employee;
import java.net.URISyntaxException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Prajwal
 */
@Path("/emp")
public class EmployeeService
{
    @GET
    @Path("/get/{empId}")
   //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Employee getEmp(@PathParam("empId") String empId)
    {
        Employee em=new Employee();
        em.setId(empId);
        em.setName("Prajwal");
        em.setEmail("pk1@gmail.com");
        return em;
    }
    
    
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    //@Consumes(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Employee createUser(Employee w)
    {
          w.setName(w.getName()+ " created");
       return w;
    }
   
    
    @PUT
     @Path("/update")
    //@Consumes(MediaType.APPLICATION_JSON)
   //@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
     public Employee updateUser(Employee w)
    {
        w.setName(w.getName()+ " updated");
        return w ;
    }
    
    
    @DELETE
    @Path("/delete/{empId}")
    public Response deleteEmp(@PathParam("empId") int empId)throws URISyntaxException
    {
     return Response.status(200).entity("Employee with "+empId+" is deleted successfully").build();
    }
    
    
    
    
}
