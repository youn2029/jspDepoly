<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	sumResult : <%=request.getAttribute("sumResult") %> <br>
	
	<%
		HttpSession sess = request.getSession();
	
		// session를 초기화??
// 		session.invalidate();
	%>
	
	[기본객체 session] sumResult : <%=session.getAttribute("sumResult") %> <br>
	[request 객체 session] sumResult : <%=sess.getAttribute("sumResult") %> <br>
	
</body>
</html>