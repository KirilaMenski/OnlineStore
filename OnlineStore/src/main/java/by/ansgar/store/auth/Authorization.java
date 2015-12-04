package by.ansgar.store.auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Authorization {

	private static HttpSession session = null;

	public static void doLogIn(HttpServletRequest request,
			HttpServletResponse response, String path, String nickName)
					throws ServletException, IOException {

		session = request.getSession();
		session.setAttribute("nickName", nickName);
		String sessionValue = (String) session.getAttribute("nickName");

		request.setAttribute("nick_name", sessionValue);
		RequestDispatcher dispathcer = request
				.getRequestDispatcher(path);
		dispathcer.forward(request, response);

	}

	public static void doLogOut(HttpServletRequest request,
			HttpServletResponse response, String path, String name) {

	}

}
