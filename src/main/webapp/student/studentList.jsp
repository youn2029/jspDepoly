<%@page import="kr.or.ddit.student.model.StudentVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<!-- top -->
	<%@ include file="/common/top.jsp" %>
	
	<form action="/studentDetail" method="get" id="frm">
		<input type="hidden" name="id" id="id">
	</form>
	
	<div class="container-fluid">
		<div class="row">
		
			<!-- left -->
			<%@ include file="/common/left.jsp" %>
			
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">					
	
				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">학생</h2>
						<div class="table-responsive">
							<table class="table table-striped table table-hover" >
								<thead>
									<tr>
										<th>학생 ID</th>
										<th>학생 이름</th>
										<th>지명 횟수</th>
										<th>등록일자(yyyy-MM-dd)</th>									
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${stdList }" var="vo">
									<%-- tr 태그 클릭시 상세 페이지로 이동 --%>
										<tr data-id="${vo.id }" >
											<td>${vo.id }</td>
											<td>${vo.name }</td>
											<td>${vo.call_cnt }</td>
											<td><fmt:formatDate value="${vo.reg_dt }" pattern="yyyy-MM-dd"/></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
				
						<a class="btn btn-default pull-right">사용자 등록</a>
				
						<div class="text-center">
							<ul class="pagination">
								<%= (String)request.getAttribute("pageNavi") %>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
	