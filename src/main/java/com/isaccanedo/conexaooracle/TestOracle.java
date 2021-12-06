package com.isaccanedo.conexaooracle;

import java.sql.*;

public class TestOracle {

	private final static String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	  private final static String USER = "system";
	  private final static String PASS = "isac";

	  public static void main(String[] args) {
	    Connection conn = null;  
	    try {    
	      Class.forName("oracle.jdbc.driver.OracleDriver");	          
	      conn = DriverManager.getConnection(DB_URL,USER,PASS); 
	      System.out.println("Connecting to database...");
	    } catch (Exception e) {    
	      e.printStackTrace();    
	    } finally {    
	      if (conn != null) {    
	        try {    
	          conn.close();    
	        } catch (SQLException e) {    
	          // ignore    
	        }    
	      }    
	    }            
	  }    
	}