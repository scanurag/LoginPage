package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
public static boolean validateLogin(String email,String password) {
	String sql="SELECT* FROM signin WHERE email='"+email+"'AND password='"+password+"'";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		if(rs.next())
		{
			con.close();
			return true;
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}
}
