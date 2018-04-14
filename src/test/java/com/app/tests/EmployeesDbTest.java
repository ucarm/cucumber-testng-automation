package com.app.tests;

import static org.testng.Assert.assertTrue;

import java.sql.SQLException;

import org.testng.annotations.Test;

import com.app.utilities.DBType;
import com.app.utilities.DBUtility;

public class EmployeesDbTest {
	
  @Test
  public void countTest() throws SQLException {
	  //Connect to oracle database
	  //run following sql query
	  //select * from employees where job_id = 'IT_PROG'
	  //more than 0 records should be returned
	  DBUtility.establishConnection(DBType.ORACLE);
	  int rowsCount = DBUtility.getRowsCount("select * from employees where job_id = 'IT_PROG'");
	  assertTrue(rowsCount > 0);
	  DBUtility.closeConnections();
  
  }
}









