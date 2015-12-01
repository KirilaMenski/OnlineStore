package by.ansgar.store.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
@WebServlet("/view_product")
public class ViewProductController extends HttpServlet {
	
	private static final Logger LOG = Logger.getLogger(ViewProductController.class);
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		RequestDispatcher dispatcher  = request.getRequestDispatcher("jsp/view_product.jsp");
		dispatcher.forward(request, response);
		LOG.info("Redirect to view_product.jsp");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

	}

}
