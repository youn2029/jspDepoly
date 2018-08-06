<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.ddit.board.model.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {background-color:#ddd}
	table th {background-color:#999}
	table td {padding:10px;background-color:#fff}
</style>
</head>
<body>
	<%
		List<BoardVo> boardList = (ArrayList<BoardVo>)session.getAttribute("boardList");
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	%>
	<table cellpadding="0" cellspacing="1" border="0">
		<thead>
			<tr>
				<th>제목</th>
				<th>사용자 아이디</th>
				<th>별명</th>
				<th>등록일(yyyy-MM-dd)</th>
			</tr>
		</thead>
		<tbody>
		<%
			for(BoardVo boardVo : boardList){ %>
				<tr>
					<td><%=boardVo.getTitle() %></td>					
					<td><%=boardVo.getUserId() %></td>					
					<td><%=boardVo.getAlias() %></td>					
					<td><%=sdf.format(boardVo.getRegDt()) %></td>							
				</tr>			
			<% }		
		%>		
		</tbody>
	</table>
</body>
</html>