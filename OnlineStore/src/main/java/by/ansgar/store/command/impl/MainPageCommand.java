package by.ansgar.store.command.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;

public class MainPageCommand implements Command{

	private static final Logger LOG = Logger.getLogger(MainPageCommand.class);
	
	public String execute(HttpServletRequest request) {
		String path= "jsp/main.jsp";
//		String path = "controller?command=main";
		
		return path;
	}

}
