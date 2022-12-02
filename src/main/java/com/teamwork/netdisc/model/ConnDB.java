package main.java.com.teamwork.netdisc.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDB {
	private Connection con = null;

	/**
	 * 返回数据库访问连接对象
	 * @return DB Connection
	 */
	public Connection getConn() {
		try {
			// 加载驱动 useUnicode=true&
			Class.forName("com.mysql.cj.jdbc.Driver");
			//这里的url需要修改
			String url="jdbc:mysql://localhost:3306/your/mysql/database?serverTimezone=UTC&characterEncoding=UTF-8" ;
			String username="root";
			String password="123456";

			// 得到连接
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// if (con != null)
		// System.out.println("******数据库连接成功！*******");
		return con;
	}
}
