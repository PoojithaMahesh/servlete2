package gste2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarnatakaServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	id name color taken from the frontend
//	cgst and sgst where it is ??
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String colour=req.getParameter("color");
	
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	
	
	ServletConfig config=getServletConfig();
	String sgst=config.getInitParameter("sgstofkar");
	
	System.out.println("CGST IS:::"+cgst);
	System.out.println("SGST IS :::"+sgst);
	
	
}
}
