//DateServlet.java
package com.nt.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class  DateServlet extends  GenericServlet
{

	
    public   DateServlet(){
		System.out.println("DateServlet::0-param constructor");
	}

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		System.out.println("DateServlet: service(-,-)");
		PrintWriter pw=null;
		Date d=null;
		//get PrintWriter 
		pw=res.getWriter();
		//set response content type
		res.setContentType("text/plain");
		//write  b.logic or request processing logic
		d=new Date();
		//writer output message to response obj
		pw.println("<h1 style='color:blue;text-align:center'>Date and time ::"+d+"</h1>");
		pw.println("<br> <img src='nit.png' >");

    /*     try{
            Thread.sleep(30000);
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
		pw.println("<br><br>  Servlet class object hashCode ::"+this.hashCode());
		pw.println("<br><br>  req obj  hashCode ::"+req.hashCode());
		pw.println("<br><br>  res obj  hashCode ::"+res.hashCode());
		pw.println("<br><br>  current thread   hashCode ::"+Thread.currentThread().hashCode()); */


		//close stream
		pw.close();
	}//service(-,-)
}//class