/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee.clients;

import com.mycompany.employee.model.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Prajwal
 */
public class PUTClient 
{
public static void main(String[] args)
{
    Client cl=Client.create();
    WebResource wr=cl.resource("http://localhost:8080/Employee/webapi/emp/update");
    
    Employee e=new Employee();
    e.setId("12345");
    e.setEmail("pkh2@gmail.com");
    e.setName("Garish");
    
    ClientResponse res=wr.type("application/xml").put(ClientResponse.class, e);
    System.out.println("PUT Operation Response Processing ");
    String output=res.getEntity(String.class);
    System.out.println(output);
}
}
