package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDao {
	public static boolean saveContact(String name,long phone,String email) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO" +" phonebook(name,phone,email)"+" VALUES(?,?,?)");
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, email);
			ps.execute();
			con.close();
			
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;
	 }
	public static ResultSet getallcontacts(String email) {
		String sql="SELECT* FROM phonebook WHERE email='"+email+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
			Statement st=con.createStatement();
			return st.executeQuery(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
