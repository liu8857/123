package org.lq.ZOO.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import lombok.extern.log4j.Log4j;
/**
 * ���ݿ⹤����
 * @author ����
 * @PROJECT SuperCRM
 * @ʱ�� 2019��5��25��-����4:56:59
 *
 */
@Log4j
public class JDBCUtil {
	
	private static String USER;
	private static String PASSWORD;
	private static String URL;
	private static String DRIVER;
	
	static {
		
		Properties prop = PropsUtil.loadProps("jdbc.properties");
		
		USER = PropsUtil.getString(prop, "user");
		PASSWORD = PropsUtil.getString(prop, "password");
		URL = PropsUtil.getString(prop, "url");
		DRIVER = PropsUtil.getString(prop, "driver");
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			log.error("���ݿ����� �û���,������ַ����", e);
		}
		
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			log.error("���ݿ����Ӵ���", e);
		}
		return conn;
	}

	

	
	public static void closeAll(PreparedStatement ps,Connection conn) {
		try {
			if(ps !=null ) ps.close();
			if(conn !=null ) conn.close();
		} catch (SQLException e) {
			log.error("���ݷ���:�ر�����������",e);
		}
	}
	public static void closeAll(PreparedStatement ps,ResultSet rs ,Connection conn) {
		try {
			if(rs !=null ) rs.close();
			if(ps !=null ) ps.close();
			if(conn !=null ) conn.close();
		} catch (SQLException e) {
			log.error("���ݷ���:�ر�����������",e);
		}
	}
	
	
	public static int executeUpdate(String sql,Object...args) {
		
		int num = 0;
		Connection conn = getConn();
		PreparedStatement ps = null;
		try {
			 ps = conn.prepareStatement(sql);
			for(int i = 0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
			num = ps.executeUpdate();
		} catch (SQLException e) {
//			e.printStackTrace();
			log.error("�����ʲ� : ���,ɾ��,�޸Ĵ���!",e);
		}finally {
			closeAll(ps, conn);
		}
		
		return num;
	}
	
	
}
