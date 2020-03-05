package com.apspdcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.apspdcl.model.Trippings;
import com.apspdcl.util.JDBCConnection;

public class TrippingDao {
	public ArrayList<Trippings> getFeederDetails(String feederName, String ehtname) {
		ArrayList<Trippings> tripping = new ArrayList<Trippings>();
		try {
			Connection con = JDBCConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM TRIPPING WHERE NAME33KV='" + feederName + "'");
			ResultSet rs = ps.executeQuery();
			Trippings t = new Trippings();
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

	public int insertValues(HttpServletRequest request) {
		String district = request.getParameter("dname");
		String ptrname = request.getParameter("ptrname");
		String capacity = request.getParameter("ptr33");
		System.out.println(district + "\t" + ptrname + "\t" + capacity);
		int i = 0;
		try {
			Connection con = JDBCConnection.getConnection();
			String sql = "INSERT INTO TRIPPING (DISTRICT,NAME33KV,PTR33KV) VALUES('" + district + "','" + ptrname + "','"
					+ capacity + "')";
			System.out.println(sql);
			Statement st = con.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;

	}

	public int updateValues(HttpServletRequest request) {
		String district = request.getParameter("dname");
		String capacity = request.getParameter("ptr33");
		String circle=request.getParameter("circle");
		
		int i = 0;
		try {
			Connection con = JDBCConnection.getConnection();
			String sql = "UPDATE TRIPPING SET CIRCLE='"+circle+"',PTR33KV='"+capacity+"' WHERE DISTRICT='"+district+"'";
			System.out.println(sql);
			Statement st = con.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int deleteRecord(HttpServletRequest request) {
		String district = request.getParameter("dname");
		int i = 0;
		try {
			Connection con = JDBCConnection.getConnection();
			String sql = "DELETE FROM TRIPPING WHERE DISTRICT='"+district+"'";
			System.out.println(sql);
			Statement st = con.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}

}
