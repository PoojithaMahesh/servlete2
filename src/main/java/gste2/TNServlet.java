package gste2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TNServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String cgst = context.getInitParameter("cgst");
		System.out.println("CGST IS:::" + cgst);
		ServletConfig config = getServletConfig();
		String sgstoftn = config.getInitParameter("sgstoftn");
		System.out.println("SGSTOF TN:::" + sgstoftn);
		String sgstkar=config.getInitParameter("sgstofkar");
		System.out.println("SGST OF KAR:::"+sgstkar);

	}
}
