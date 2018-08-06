package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTable
 */
@WebServlet("/TimesTable")
public class TimesTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimesTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
				
		pw.write("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<title>Insert title here</title>"
				+ "<style>"
				+ "body {padding-top:50px}"
				+ "table {background-color:#ddd}"
				+ "table td {padding:10px;background-color:#fff}"
				+ "</style>"
				+ "</head>"
				+ "<body>"
				+ "<h2 align=\"center\">구구단</h2>"
				+ "<table cellpadding=\"0\" cellspacing=\"1\" border=\"0\" align=\"center\">");
		
		for (int i = 1; i <= 9; i++) {
			pw.write("<tr>");			
			for (int j = 1; j <= 9; j++) {
				pw.write("<td>"+j+" * "+i+" = "+i*j+"</td>");
			}			
			pw.write("</tr>");
		}		
		pw.write("</table>"
		+ "</body>"
		+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
