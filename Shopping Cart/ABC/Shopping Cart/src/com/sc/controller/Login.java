package com.sc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);


	String user = req.getParameter("user");
	String pass = req.getParameter("pass");
	
	if(user.equals("uno") &&  pass.equals("uno123"))
	{
		/*HttpSession session = req.getSession();
		session.setAttribute("username", user);*/
		resp.sendRedirect("welcome.jsp");
	}
	else
	{
		resp.sendRedirect("index.html");
	}
}

}