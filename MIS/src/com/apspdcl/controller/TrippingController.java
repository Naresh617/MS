package com.apspdcl.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apspdcl.model.Trippings;
import com.apspdcl.util.JDBCConnection;

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
		ArrayList<Trippings> tripping=new ArrayList<Trippings>();
		  
	     try { 
	        Connection con=JDBCConnection.getConnection();
	 		PreparedStatement ps=con.prepareStatement("SELECT * FROM TRIPPING WHERE NAME33KV='"+feederName+"'");  
	 		ResultSet rs=ps.executeQuery();  
	 		Trippings t=new Trippings();
			 while (rs.next()) { 
				 t.setDistrict(rs.getString("DISTRICT"));
				 t.setPtrCapacityName(rs.getString("NAME33KV"));
				 tripping.add(t);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  
	     
	     request.setAttribute("trippings", tripping);
	     request.getRequestDispatcher("index.jsp").forward(request, response);
	     
	}

}
