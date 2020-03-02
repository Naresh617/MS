package com.apspdcl.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TrippingController")
public class TrippingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TrippingController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String feederName=request.getParameter("fname");
		String ehtname=request.getParameter("ehtname");
		  
	     try {
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");  
	    	 Connection con=DriverManager.getConnection(  
	    	 "jdbc:oracle:thin:@localhost:1521:xe","naresh","naresh");  
	 		PreparedStatement ps=con.prepareStatement("select * from emp");  
	 		ResultSet rs=ps.executeQuery();  
			 while (rs.next()) {  
			           System.out.println("Name= "+rs.getString(2)+"\t"+"Paasword= "+rs.getString(3));      
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	     
	}

}
