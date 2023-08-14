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

import dao.LoginDao;

@WebServlet("/validateLogin")
public class ValidateLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp )throws ServletException, IOException{
	String email=req.getParameter("email");
	String password=req.getParameter("pwd");
	
	boolean res=LoginDao.validateLogin(email,password);
	if(res) {
		HttpSession hs=req.getSession();
		hs.setAttribute("email", email);
		RequestDispatcher rd=req.getRequestDispatcher("Lhome.jsp");
		rd.forward(req, resp);
		
	}else {
		PrintWriter pw=resp.getWriter();
		pw.write("<h1 style=color:red>SOMETHING WENT WRONG!!PLEASE TRY AGANE</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("Login1.jsp");
		rd.include(req, resp);	
	}

}
}