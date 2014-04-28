package com.slk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultithreadServlet extends HttpServlet{
	
	private int counter = 0;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
		System.out.println("in get serviceeeee");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<HTML><BODY>");
		response.getWriter().println(this + " :<br>");
		for(int i = 0; i < 10; i++) {
			response.getWriter().println("counter = " + counter + "<br>");
			try
		      {
		        Thread.currentThread().sleep((long) Math.random() * 1000);
		        counter++;
		      }
		      catch (InterruptedException exc) { }
		}
	    response.getWriter().println("</BODY></HTML>");
	}

}
