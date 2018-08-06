<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>

      <form action="<%=application.getContextPath() %>/sumCalculation" method="post">
        <h2>sumInput</h2><br>
        
        <label>Start</label>
        <input type="text" name="start"><br>
        
        <label>End</label>
        <input type="text" name="end"><br>
        
        <button type="submit">전송</button>
      </form>

    </div>
</body>
</html>