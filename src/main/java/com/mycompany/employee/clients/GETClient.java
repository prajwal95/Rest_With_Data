/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee.clients;


/**
 *
 * @author Prajwal
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
public class GETClient 
{
    public static void main(String[] args)
    {
        Client cl=Client.create();
        WebResource wr=cl.resource("http://localhost:8080/Employee/webapi/emp/get/120");
        ClientResponse resp=wr.type("application/json").get(ClientResponse.class);
        System.out.println("Get Operation Response Processing");
        String output=resp.getEntity(String.class);
        System.out.println(output);
        
        
    }
}





