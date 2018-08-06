package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MulCalculation
 */
@WebServlet("/mulCalculation")
public class MulCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		int param1 = Integer.parseInt(request.getParameter("param1"));
		int param2 = Integer.parseInt(request.getParameter("param2"));
		
		int mul = 0;
		mul = param1 * param2;
		
		if (param1 < 0 || param2 < 0) {
			mul = 0;
		}
		
		pw.write(param1+" * "+param2+" = "+mul);
		
		System.out.println(mul);
	}

}
