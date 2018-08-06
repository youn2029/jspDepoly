package kr.or.ddit.student.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.student.model.StudentVo;
import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceInf;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/studentList")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = request.getParameter("page")==null ? 1 : Integer.parseInt(request.getParameter("page"));
		int pageSize = request.getParameter("pageSize")==null ? 10 : Integer.parseInt(request.getParameter("pageSize"));
		
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("page", page);
		paramMap.put("pageSize", pageSize);
		
		// StudentService 객체를 생성, 학생 전체 리스트를 조회
		// 학생 전체 리스트 request객체에 속성으로 설정
		// studentList.jsp로 forward		
		StudentServiceInf stdService = new StudentService();
		Map<String, Object> resultMap = stdService.getStudentPageList(paramMap);
		
		request.setAttribute("stdList", resultMap.get("stdList"));
		request.setAttribute("totCnt", resultMap.get("totCnt"));
		request.setAttribute("pageNavi", resultMap.get("pageNavi"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/student/studentList.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
