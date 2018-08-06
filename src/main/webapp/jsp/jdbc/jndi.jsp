<%@page import="javax.sql.DataSource"%>
<%@page import="oracle.net.ns.DataDescriptorPacket"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="org.apache.commons.dbcp2.BasicDataSource"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
		db connection 얻는 방법 3가지
		1. jdbc
		2. application connection pool
		3. was connection pool (jndi)
		
		각 방법별로 컨넥션을 생성하는 시간 profiling
	
	-->

	<%
		Context context = new InitialContext();

		DataSource dataSource = (DataSource) context
				.lookup("java:comp/env/jdbc/oracleDB");

		Connection conn = null;

		try {

			long startTime = System.currentTimeMillis();

			// 컨넥션을 100번 얻어오고 해제한다.		
			for (int i = 0; i < 30; i++) {
				conn = dataSource.getConnection();
				out.write(i + "번 schema : " + conn.getSchema() + "<br>");
				conn.close();
			}

			long endTime = System.currentTimeMillis();

			out.write("during : " + (endTime - startTime) + "ms");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			else {
			}
			;
		}

		//localhost:8180/jsp/jdbc/jndi.jsp
	%>

</body>
</html>