package by.ansgar.store.controllers;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;
import by.ansgar.store.command.CommandFactory;

@WebServlet("/controller")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = Logger.getLogger(Controller.class);

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		processComand(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		processComand(request, response);
	}

	public void destroy() {
		super.destroy();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// ServletContext context = config.getServletContext();
		// String log4jConfigFile = context
		// .getInitParameter("log4j-config-location");
		// String fullPath = context.getRealPath("") + File.separator
		// + log4jConfigFile;
		//
		// PropertyConfigurator.configure(fullPath);
		//
		// System.out.println(fullPath);

	}

	public void processComand(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		Command command = CommandFactory.defineCommand(request);
		String page = command.execute(request);
		response.setHeader("Cache-Control",
				"no-cache, no-store, must-revalidative");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		HttpSession session = request.getSession();
		String sessionValue = (String) session.getAttribute("nick_name");
		if(sessionValue != null){
			request.setAttribute("nick_name", sessionValue);
		}else{
			request.setAttribute("nick_name", "Guest");
		}
		if (page != null) {
			request.getRequestDispatcher(page).forward(request, response);
		} else {

		}

	}

}
