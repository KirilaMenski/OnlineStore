package by.ansgar.store.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
@WebServlet("/main")
public class MainPageController extends HttpServlet {

	private static final Logger LOG = Logger.getLogger(MainPageController.class);
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		String sessionValue = (String)session.getAttribute("nickName");

		request.setAttribute("nick_name", sessionValue);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/main.jsp");
		dispatcher.forward(request, response);
		LOG.info("Redirect to main.jsp");
		System.out.println(request.getParameter("COMMAND"));
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{

	}

}
