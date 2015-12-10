package by.ansgar.store.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import by.ansgar.store.auth.Authorization;
import by.ansgar.store.entity.User;
import by.ansgar.store.service.UserService;
import by.ansgar.store.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(RegistrationController.class);

	private UserService userService = new UserServiceImpl();
	private User user = new User();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {
			String nickName = request.getParameter("nick_name");
			String email = request.getParameter("email");
			String password = request.getParameter("rep_password");
			String role = "user";

			user.setNickName(nickName);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);

			userService.addUser(user);
			LOG.info("User " + nickName + " registrate succsesffuly");
			
//			HttpSession session = request.getSession();
//			session.setAttribute("nickName", nickName);
//			String sessionValue = (String)session.getAttribute("nickName");
//
//			request.setAttribute("nick_name", sessionValue);
//			
//			RequestDispatcher dispathcer = request
//					.getRequestDispatcher("jsp/main.jsp");
//			dispathcer.forward(request, response);
			Authorization.doLogIn(request, response, "jsp/main.jsp", nickName);
			

		} catch (SQLException e) {
			LOG.error("Registration error!", e);
		}

	}

}
