package by.ansgar.store.service.impl;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.store.dao.UserDAO;
import by.ansgar.store.dao.impl.UserDAOImpl;
import by.ansgar.store.entity.User;
import by.ansgar.store.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO = new UserDAOImpl();
	
	public void addUser(User user) throws SQLException {
		userDAO.addUser(user);
	}

	public void updateUser(User user) throws SQLException {
		
	}

	public void deleteUsers(User user) throws SQLException {
		
	}

	public List<User> allUsers() throws SQLException {
		return null;
	}

	public List<User> userById(long id) throws SQLException {
		return null;
	}

	public List<User> userByName(String userName) throws SQLException {
		List<User> user = userDAO.userByName(userName);
		return user;
	}

}
