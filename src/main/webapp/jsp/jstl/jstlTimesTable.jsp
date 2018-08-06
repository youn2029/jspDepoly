<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {padding-top:50px}
	table {background-color:#ddd}
	table td {padding:10px;background-color:#fff}
</style>
</head>
<body>

	<c:set var="dan" value="1,2,3,4,5,6,7,8,9"/>
	<c:set var="num" value="1,2,3,4,5,6,7,8,9"/>
	
	<table cellpadding="0" cellspacing="1" border="0" align="center">
		<c:forEach items="${num }" var="j">
			<tr>
				<c:forEach items="${dan }" var="i">
					<td>${i } * ${j }= ${i*j }</td>
				</c:forEach>
			</tr>
		</c:forEach>
		
<%-- 		<c:forEach begin="1" end="9" var="i"> --%>
<!-- 			<tr> -->
<%-- 				<c:forEach begin="1" end="9" var="j"> --%>
<%-- 					<td>${j } * ${i }= ${i*j }</td> --%>
<%-- 				</c:forEach> --%>
<!-- 			</tr> -->
<%-- 		</c:forEach> --%>
	</table>

</body>
</html>