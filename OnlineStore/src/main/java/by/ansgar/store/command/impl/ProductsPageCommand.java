package by.ansgar.store.command.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import by.ansgar.store.command.Command;

public class ProductsPageCommand implements Command {

	private static final Logger LOG = Logger.getLogger(ProductsPageCommand.class);
	
	public String execute(HttpServletRequest request) {
		String path = "jsp/products.jsp";
		return path;
	}

}
