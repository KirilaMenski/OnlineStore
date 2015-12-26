package by.ansgar.store.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;

public class LogOutCommand implements Command{

	private static final Logger LOG = Logger.getLogger(LogOutCommand.class);
	
	public String execute(HttpServletRequest request) {
		String page = "controller?command=main";
		
		HttpSession session = request.getSession();
		session.invalidate();
		return page;
	}

}
