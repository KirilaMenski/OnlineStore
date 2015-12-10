package by.ansgar.store.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.ansgar.store.command.Command;

public class ProfilePageCommand implements Command {

	public String execute(HttpServletRequest request) {
		String page = "jsp/profile.jsp";
		return page;
	}

}
