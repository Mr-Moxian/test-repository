package com.sts.javaIoc.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	private static final String DRIVER_NAME = "org.gjt.mm.mysql.Driver";
	private static final String URL = "jdbc:mysql://47.93.51.25:3306/drp_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Sauser#123";
	public static void main(String[] args) {
		queryItem();
	}
	
	private static void queryItem() {
		Connection conn = null ;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动
			Class.forName(DRIVER_NAME);
			//获取连接对象
			conn= DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//将sql语句发送至database
			ps = conn.prepareStatement("select * from t_sys_user");
			//获取结果集
			rs = ps.executeQuery();
			//遍历结果集
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("account"));
				System.out.println("-----------");
			}
		} catch (Exception e) {
			// 异常处理
			e.printStackTrace();
		}
		finally {
			//释放资源，关闭连接
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

	}
}
