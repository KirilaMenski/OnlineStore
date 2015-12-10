package by.ansgar.store.dao;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.store.entity.User;

public interface UserDAO {

	public void addUser(User user) throws SQLException;

	public void updateUser(User user) throws SQLException;

	public void deleteUsers(User user) throws SQLException;

	public List<User> allUsers() throws SQLException;

	public List<User> userById(long id) throws SQLException;

}
