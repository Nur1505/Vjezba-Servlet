package com.nura.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String ime = request.getParameter("ime");
        String prezime = request.getParameter("prezime");
        String datum = request.getParameter("datumRodjenja");
        String email = request.getParameter("email");
        String adresa = request.getParameter("adresa");
		
        RequestDispatcher rq =  request.getRequestDispatcher("podaci.jsp") ;
        rq.forward(request, response);
      
        
	}

}
