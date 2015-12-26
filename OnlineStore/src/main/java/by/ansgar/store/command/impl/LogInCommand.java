package by.ansgar.store.command.impl;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;
import by.ansgar.store.entity.User;
import by.ansgar.store.service.UserService;
import by.ansgar.store.service.impl.UserServiceImpl;

public class LogInCommand implements Command {

	private static final Logger LOG = Logger.getLogger(LogInCommand.class);

	private UserService userService = new UserServiceImpl();

	public String execute(HttpServletRequest request) {

		String path = "controller?command=main";

		String userName = request.getParameter("user_name");
		String userPassword = request.getParameter("user_password");
		try {
			List<User> user = userService.userByName(userName);

			for (int i = 0; i < user.size(); i++) {
				if (userPassword.equals(user.get(i).getPassword())) {
					HttpSession session = request.getSession();
					session.setAttribute("nick_name", userName);
					session.setAttribute("user_role", user.get(i).getRole());
					path = "controller?command=profile";
					return path;
				}
			}

		} catch (Exception e) {
			LOG.error("Error was occured in login", e);
			request.setAttribute("login_error",
					"Login or password is wrong. Please check you data!");
		}

		return path;
	}

}
