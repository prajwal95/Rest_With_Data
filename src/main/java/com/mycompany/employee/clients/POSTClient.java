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
public class POSTClient 
{
    public static void main(String[] args)
    {
        Client cl=Client.create();
        WebResource wr=cl.resource("http://localhost:8080/Employee/webapi/emp/create");
        
        Employee e=new Employee();
        e.setId("12345");
        e.setEmail("rajk@yahoo.com");
        e.setName("Raj Kumar");
        
        
        ClientResponse res=wr.type("application/xml").post(ClientResponse.class,e);
        System.out.println("Create Operation Response Processing");
        String output=res.getEntity(String.class);
        System.out.println(output);
    }
}
