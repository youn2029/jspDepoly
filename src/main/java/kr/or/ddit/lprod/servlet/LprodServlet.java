package kr.or.ddit.lprod.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.lprod.service.LprodServiceInf;

/**
 * Servlet implementation class LprodServlet
 */
@WebServlet("/lprodList")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		//page, pageSize를 map에 저장
		String pageStr = request.getParameter("page");
		String pageSizeStr = request.getParameter("pageSize");
		
		int page = pageStr==null ? 1 : Integer.parseInt(pageStr);
		int pageSize = pageSizeStr==null ? 6 : Integer.parseInt(pageSizeStr);
		
		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("page", page);
		pageMap.put("pageSize", pageSize);
				
		// 페이지네이션 조회한 List와 페이지네이션 값을 map에 저장
		LprodServiceInf lprodService = new LprodService();
		Map<String, Object> pageLprodMap = lprodService.getPageLprod(pageMap);
		
		// map에 저장된 값을 request에 set
		request.setAttribute("lprodList", (List<LprodVO>)pageLprodMap.get("lprodList"));
		request.setAttribute("pageStr", pageLprodMap.get("pageStr"));
		
		// forward
		request.getRequestDispatcher("/lprod/lprodList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
