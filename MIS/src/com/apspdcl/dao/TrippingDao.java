package com.apspdcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.apspdcl.model.Trippings;
import com.apspdcl.util.JDBCConnection;

public class TrippingDao {
	public ArrayList<Trippings> getFeederDetails(String feederName, String ehtname) {
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
		return tripping;  
	}

}
