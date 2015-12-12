package by.ansgar.store.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.ansgar.store.dao.UserDAO;
import by.ansgar.store.entity.User;
import by.ansgar.store.util.ConnectionPool;

public class UserDAOImpl implements UserDAO {

	private static final Logger LOG = Logger.getLogger(UserDAOImpl.class);

	public void addUser(User user) throws SQLException {
		Connection connection = null;
		PreparedStatement prepStatment = null;
		try {
			connection = ConnectionPool.getConnection();
			prepStatment = connection.prepareStatement(
					"INSERT INTO user (nick_name, password, email, role) VALUES(?,?,?,?)");

			prepStatment.setString(1, user.getNickName());
			prepStatment.setString(2, user.getPassword());
			prepStatment.setString(3, user.getEmail());
			prepStatment.setString(4, user.getRole());
			prepStatment.executeUpdate();
		} catch (SQLException e) {
			LOG.error("SQLException was occured", e);
		} finally {
			if (prepStatment != null) {
				prepStatment.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
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
		List<User> user = new ArrayList<User>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionPool.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(
					"SELECT * FROM user WHERE nick_name ='" + userName + "'");
			while (resultSet.next()) {
				long id = resultSet.getLong("user_id");
				String name = resultSet.getString("nick_name");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				String role = resultSet.getString("role");
				user.add(new User(id, name, password, email, role));
			}
		} catch (SQLException e) {
			LOG.error("Error was occured in get user by name", e);
		} finally {
			if (resultSet != null) {
				resultSet.close();
			}
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		}

		return user;
	}

}
