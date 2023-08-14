package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ContactDao;

@WebServlet("/addcontact")
public class AddContact  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp )throws ServletException, IOException{
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
	boolean	res=ContactDao.saveContact(name, phone, email);
	if(res) {
		PrintWriter pw=resp.getWriter();
		pw.write("<h1>DATA SAVED SUCCESSFULL</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("Lhome.jsp");
		rd.include(req, resp);	
		
	}else {
		PrintWriter pw=resp.getWriter();
		pw.write("<h1>SOMETHING WENT WRONG!!PLEASE TRY AGANE</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("Lhome.jsp");
		rd.include(req, resp);	
	}

}
		
}
