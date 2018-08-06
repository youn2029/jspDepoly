package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sumCalculation
 */
@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		int start = Integer.parseInt(request.getParameter("start"));
		int end = Integer.parseInt(request.getParameter("end"));		
		
		int sum = 0;
		if (start>end) {
			sum = 0;
		}else{
			for (int i = start; i <= end; i++) {
				sum += i;
			}
			
		}
//		System.out.println("sum : "+sum);
		
		// request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
		// request객체에 일시적으로 값을 저장하는 방법
		request.setAttribute("sumResult", sum);
		
		// session에서 sumResult를 저장한다.
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
		rd.forward(request, response);
		
		
	}

}
