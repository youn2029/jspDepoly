<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/js/jquery-1.12.4.js"></script>
<script>	
	$(document).ready(function(){
		
		$("#locale").change(function(){
			var language = $("#locale option:selected").val();
			location.href="http://localhost:8180/localeSelect?locale="+language;
		});
	});
</script>
</head>
<body>
	
	<select id="locale" name="locale">
		<option value="ko" ${locale == 'ko' ? "selected" : "" }>Korean</option>
		<option value="ja" ${locale == 'ja' ? "selected" : "" }>日本語</option>
		<option value="en" ${locale == 'en' ? "selected" : "" }>English</option>
	</select><br>
	
	<fmt:setLocale value="${locale }"/>
	
	<fmt:bundle basename="kr.or.ddit.msg.msg">
		<fmt:message key="hello"/><br>
		<fmt:message key="visitor">
			<fmt:param value="${userId }"/>
		</fmt:message>
	</fmt:bundle>
</body>
</html>