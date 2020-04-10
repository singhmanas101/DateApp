package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet  {
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Date d=new Date();
		pw.println(d);
		pw.close();
		
	}
	

}
