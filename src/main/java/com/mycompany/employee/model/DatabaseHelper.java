/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee.model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Prajwal
 */
public class DatabaseHelper 
{
    
  /*  
public void getValue()
{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(q);
            while(rs.next())
            {
                testModel o=new testModel();
                o.setId(rs.getInt("id"));
                o.setName(rs.getString("name"));
                o.setEmail(rs.getString("email"));
                tm.add(o);
            }
}
    
    */
    
    
    
public static void main(String[] args)
{
    Connection con=null;
		try
		{
		String uname="root";
		String pass="1234";
		String url="jdbc:mysql://localhost:3306/trial_fulltime";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con=DriverManager.getConnection(url, uname, pass);
		System.out.println("Database connection created !!");
		}
		catch(Exception e)
		{
                    System.out.println(e);
			System.out.println("Database connection cannot be created !!");
		}
                
              /*  finally
		{
            if(con != null)
            {
            	try
            	{
            		con.close();
            		System.out.println("Database closed");
            	}
            	catch(Exception e)
            	{
            		System.out.println("Some err");
            	}
            }
		}*/
}
}
