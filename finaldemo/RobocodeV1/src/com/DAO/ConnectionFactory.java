package com.DAO;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionFactory {
		String driverClassName = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://10.244.0.143:32768/robocode";
		String dbUser = "5ryvs9z2xq0aojmn";
		String dbPwd = "z4o8fpvpv2sdfl75";

		private static ConnectionFactory connectionFactory = null;

		private ConnectionFactory() {
			try {
				Class.forName(driverClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public Connection getConnection() throws SQLException {
			Connection conn = null;
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			return conn;
		}

		public static ConnectionFactory getInstance() {
			if (connectionFactory == null) {
				connectionFactory = new ConnectionFactory();
			}
			return connectionFactory;
		}
	}
