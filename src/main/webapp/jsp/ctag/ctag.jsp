<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>logging</h3>
<tags:logging />
	<c:forEach items="${stdList }" var="stdVo"><br>
		${stdVo.id } / 
		${stdVo.name } / 
		${stdVo.call_cnt } / 
		<fmt:formatDate value="${stdVo.reg_dt }" pattern="yyyy-MM-dd"/>
	</c:forEach><br>
<tags:logging />

<h3>colorlogging</h3>
<tags:colorLogging color="#e74c3c" size="20"/>
	<c:forEach items="${stdList }" var="stdVo"><br>
		${stdVo.id } / 
		${stdVo.name } / 
		${stdVo.call_cnt } / 
		<fmt:formatDate value="${stdVo.reg_dt }" pattern="yyyy-MM-dd"/>
	</c:forEach><br>
<tags:colorLogging color="#3498db"/>

<h3>prod</h3>
<tags:prodSelect lgu="P101"/><br>
<tags:prodSelect lgu="P201"/>
</body>
</html>