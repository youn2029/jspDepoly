<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- http://localhost:8180/jsp/jstl/url.jsp --%>
<c:url value="/main.jsp" var="url"/>${url } <br>
<c:url value="/main.jsp">
	<c:param name="redirectFrom" value="url.jsp"/>
</c:url>
</body>
</html>