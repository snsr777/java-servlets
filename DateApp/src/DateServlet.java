//DateServlet.java
package com.nt.servlet;
import javax.servlet.*;
import java.util.*;
import java.io.*;
public class DateServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Date d=null;
		PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		d=new Date();
		pw.println("<h1>Date and time:::"+d.toString()+"</h1>");
		pw.close();
	}
}
