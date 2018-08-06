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
		// localhost:8180/jsp/cookie.jsp
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			out.write(cookie.getName()+" : "+cookie.getValue()+"<br>");
		}
		
		Cookie newCookie = new Cookie("serverCookie","serverCookieValue");
		newCookie.setMaxAge(60*60*24*30);		//30일
		response.addCookie(newCookie);
	%>
</body>
</html>