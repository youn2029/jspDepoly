<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/common/jquery.jsp" %>

<script>
	// select box변경시 요청이 되도록 수정
	$(function(){
		
		// 페이징 로딩시 select box 설정
		$("select[name=locale]").val("${param.locale}").prop("selected", true);	
		
		$("select[name=locale]").change(function(){
			// 이벤트 처리 유무 확인
// 			console.log("selectbox change");			
			$("form").submit();
		});
	});
	
</script>
</head>
<body>
	<c:set value="brown" var="userId"/>
	
	<form action="/localeSelect" method="get">
		<select id="locale" name="locale">
			<option value="ko" >Korean</option>
			<option value="ja" >日本語</option>
			<option value="en" >English</option>
		</select>
		<input type="submit" value="확인">
	</form>
	                                                                                                                                                                                                                                                                              
	<fmt:setLocale value="${param.locale }"/>
	
	<fmt:bundle basename="kr.or.ddit.msg.msg">
		<fmt:message key="hello"/><br>
		<fmt:message key="visitor">
			<fmt:param value="${userId }"/>
		</fmt:message>
	</fmt:bundle>
</body>
</html>