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
@WebServlet("/products")
public class ProductsController extends HttpServlet{
	
	private static final Logger LOG = Logger.getLogger(ProductsController.class);
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/products.jsp");
		dispatcher.forward(request, response);
		LOG.info("Redirect to product.jsp");
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{

	}

}
