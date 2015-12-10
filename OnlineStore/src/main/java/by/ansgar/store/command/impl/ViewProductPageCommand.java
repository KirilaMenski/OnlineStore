package by.ansgar.store.command.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;

public class ViewProductPageCommand implements Command {

	private static final Logger LOG = Logger.getLogger(ViewProductPageCommand.class);
	
	public String execute(HttpServletRequest request) {
		String path = "jsp/view_product.jsp";
		return path;
	}

}
