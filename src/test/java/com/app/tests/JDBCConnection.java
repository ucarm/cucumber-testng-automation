package com.app.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBCConnection {
  
	String oracleDbUrl = "jdbc:oracle:thin:@ec2-52-70-143-199.compute-1.amazonaws.com:1521:xe";
	String oracleDbUsername = "hr";		
	String oracleDbPassword = "hr";
	
	
  @Test
  public void oracleJDBC() throws SQLException {
	  Connection connection=DriverManager.getConnection(oracleDbUrl, oracleDbUsername, oracleDbPassword); 
	  Statement statement=connection.createStatement();
	  ResultSet resultSet = statement.executeQuery("select * from countries");

	  resultSet.next();
	  
	  System.out.println(resultSet.getString(1));
	  System.out.println(resultSet.getString("country_name"));
	  System.out.println(resultSet.getInt("region_id"));	  
		
	  resultSet.next();
	  System.out.println(resultSet.getString(1));
	  System.out.println(resultSet.getString("country_name"));
	  System.out.println(resultSet.getInt("region_id"));	 
	  
	  resultSet.next();
	  System.out.println(resultSet.getString(1));
	  System.out.println(resultSet.getString("country_name"));
	  System.out.println(resultSet.getInt("region_id"));	 
	  
	  resultSet.close();	  
	  statement.close();	  
	  connection.close();
  }
}







