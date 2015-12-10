package by.ansgar.store.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS;
import org.apache.commons.dbcp.datasources.SharedPoolDataSource;
import org.apache.log4j.Logger;

public class ConnectionPool {

	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);

	private static final String URL = "jdbc:mysql://localhost:3306/onStore";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "yj55";
	private static DataSource dataSource;

	static {
		DriverAdapterCPDS adapterCPDS = new DriverAdapterCPDS();

		try {
			adapterCPDS.setDriver(DRIVER);
			adapterCPDS.setUrl(URL);
			adapterCPDS.setUser(USERNAME);
			adapterCPDS.setPassword(PASSWORD);

			SharedPoolDataSource sharedPool = new SharedPoolDataSource();
			sharedPool.setConnectionPoolDataSource(adapterCPDS);

			dataSource = sharedPool;

		} catch (ClassNotFoundException e) {
			LOG.error("Error was occured in connection to data bases", e);
		}
	}

	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

}
