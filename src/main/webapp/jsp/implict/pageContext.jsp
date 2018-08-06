<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// localhost:8180/jsp/implict/pageContext.jsp
	// request, response, session, out, application, config
	// pageContext : 다른 객체에 대한 전반적인 정보를 갖고 있습니다.
	
	pageContext.getRequest();			// request 기본객체와 비교

	// application -->
	pageContext.getServletContext();	// application
	pageContext.getSession();			// session
	pageContext.getOut();				// out
%>
	
	pageContext.getRequest() == request : <%=pageContext.getRequest().equals(request) %><br>
	pageContext.getServletContext() == application : <%=pageContext.getServletContext().equals(application) %><br>
	pageContext.getSession() == session : <%=pageContext.getServletContext().equals(session) %><br>
	pageContext.getOut() == out : <%=pageContext.getServletContext().equals(out) %><br>
</body>
</html>