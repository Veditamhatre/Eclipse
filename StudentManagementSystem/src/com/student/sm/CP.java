package com.student.sm;

import java.sql.Connection;
import java.sql.DriverManager;


public class CP {

	static Connection con;
	public static Connection createc(){
		
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","VeditaM@04");
			    
			    }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return con;
		}
	}
