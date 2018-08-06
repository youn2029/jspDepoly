package kr.or.ddit.locale;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocaleSelect
 */
@WebServlet("/localeSelect")
public class LocaleSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
//		System.out.println("language1 : "+ request.getParameter("locale"));
		
		// 파라미터 language 값을 가져온다 (null 처리)
//		String locale = request.getParameter("locale") == null ? "ko" : request.getParameter("locale");
//		System.out.println("language2 : "+language);
		
		// language의 값을 request에 저장하고 forward
//		request.setAttribute("locale", locale);
//		request.setAttribute("userId", "brown");
		
//		request.getRequestDispatcher("/jsp/jstl/localeSelect.jsp").forward(request, response);
		request.getRequestDispatcher("/jsp/jstl/localeSelect_sam.jsp").forward(request, response);
	}
}
