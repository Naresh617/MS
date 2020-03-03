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

import com.apspdcl.dao.TrippingDao;
import com.apspdcl.model.Trippings;
import com.apspdcl.util.JDBCConnection;

@WebServlet("/TrippingController")
public class TrippingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TrippingController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String feederName = request.getParameter("fname");
		String ehtname = request.getParameter("ehtname");
		TrippingDao dao = new TrippingDao();
		ArrayList<Trippings> tripping = dao.getFeederDetails(feederName, ehtname);
		request.setAttribute("trippings", tripping);
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

}
