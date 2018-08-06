<%@page import="kr.or.ddit.student.model.StudentVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<!-- top -->
	<%@ include file="/common/top.jsp" %>
	
	<div class="container-fluid">
		<div class="row">
		
			<!-- left -->
			<%@ include file="/common/left.jsp" %>
			
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">					
	
				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">Lprod</h2>
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>lprod ID</th>
									<th>lprod GU</th>
									<th>lprod NM</th>
								</tr>
								
								<c:forEach items="${lprodList }" var="vo">
									<tr>
										<td>${vo.lprod_id }</td>
										<td>${vo.lprod_gu }</td>
										<td>${vo.lprod_nm }</td>
										
									</tr>
								</c:forEach>
								
							</table>
						</div>
				
						<a class="btn btn-default pull-right">사용자 등록</a>
				
						<div class="text-center">
							<ul class="pagination">
								${pageStr }
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
	