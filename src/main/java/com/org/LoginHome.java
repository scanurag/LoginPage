package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/anu")
public class LoginHome extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp )throws ServletException, IOException{
		String Username=req.getParameter("a");
		String Email=req.getParameter("b");
		String Password=req.getParameter("c");
		String Description=req.getParameter("d");
		int i=0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anu","root","root");
				String sql="INSERT INTO loginpage VALUES(?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, Username);
				ps.setString(2, Email);
				ps.setString(3, Password);
				ps.setString(4,Description);
				i=ps.executeUpdate();
				con.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		PrintWriter pw=resp.getWriter();
		 if(i!=0)
		 {
			 pw.write("<html><body><h1>DATA SAVE SUCCESSFULL</h1></body></html>");
			 RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			 rd.include(req, resp);
		 }
		 else
		 {
			 pw.write("<html><body><h1>SOMETHING WENT WORNG</h1></body></html>");
			 RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			 rd.include(req, resp);
		 }
	}
	}
	
