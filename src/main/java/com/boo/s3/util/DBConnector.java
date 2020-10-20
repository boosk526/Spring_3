package com.boo.s3.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class DBConnector {
	
	public Connection getConnect() throws Exception {
		//1. 연결정보
		String user ="hr";
		String password="tiger";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		//211.238.142.147
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 드라이버를 메로리에 로딩
		Class.forName(driver);
		System.out.println("드라이버 로딩 성공");
		
		//3. DB로그인 Connection 객체 반환
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("로그인 성공");
		System.out.println(con);
				
		return con;
				
	}

}
