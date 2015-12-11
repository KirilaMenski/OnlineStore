package by.ansgar.store.command.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;
import by.ansgar.store.entity.User;
import by.ansgar.store.service.UserService;
import by.ansgar.store.service.impl.UserServiceImpl;

public class RegistrationCommand implements Command {

	private static final Logger LOG = Logger
			.getLogger(RegistrationCommand.class);
	private User user = new User();
	private UserService userService = new UserServiceImpl();

	public String execute(HttpServletRequest request) {
		String path = "jsp/main.jsp";
		String nickName = request.getParameter("nick_name");
		String email = request.getParameter("email");
		String password = request.getParameter("rep_password");
		String role = "USER";
		try {
			user.setNickName(nickName);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);
			userService.addUser(user);
			
			HttpSession session = request.getSession();
			session.setAttribute("nick_name", nickName);
//			String sessionValue = (String) session.getAttribute("nick_name");
//			request.setAttribute("nick_name", sessionValue);
		} catch (SQLException e) {
			LOG.error("The error was occured in registration", e);
		}
		return path;
	}

}
