package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.dao.LprodDao;
import kr.or.ddit.lprod.dao.LprodDaoInf;
import kr.or.ddit.lprod.model.LprodVO;

public class LprodService implements LprodServiceInf {
	
	LprodDaoInf lprodDao = new LprodDao();

	/**
	* Method : getPageLprod
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @param pageMap
	* @return
	* Method 설명 : lprod 페이지네이션 조회
	*/
	@Override
	public Map<String, Object> getPageLprod(Map<String, Integer> pageMap) {
		
		// 리턴할 map선언
		Map<String, Object> pageLprodMap = new HashMap<String, Object>();
		
		// map를 통해 페이지네이션 조회
		List<LprodVO> lprodList = lprodDao.getPageLprods(pageMap);
		
		// totlaCnt 조회
		int totalCnt = lprodDao.getCountLprod();
		
		// 페이지네이션의 전체 크기 설정
		String pageStr = pagination(pageMap.get("page"), pageMap.get("pageSize"), totalCnt);
		
		// 페이지네이션List, 페이지네이션의 전체크기설정 값을 map에 담는다
		pageLprodMap.put("lprodList", lprodList);
		pageLprodMap.put("pageStr", pageStr);
		
		return pageLprodMap;
	}
	
	/**
	* Method : pagination
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @param page
	* @param pageSize
	* @param totalCnt
	* @return
	* Method 설명 : lprod 페이지네이션을 한 html
	*/
	private String pagination(int page, int pageSize, int totalCnt){
		StringBuffer pageStr = new StringBuffer();
		
		// 페이지네이션 전체 수
		int pageNum = totalCnt%10 == 0 ? totalCnt/10 : totalCnt/10+1;
		
		int prevPage = page == 1 ? 1 : page-1;
		int nextPage = page == pageNum ? pageNum : page+1;
		
		// 이전으로
		pageStr.append("<li><a href=\"/lprodList?page="+prevPage+"&pageSize="+pageSize
				+"\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>");		
		
		
		for (int i = 1; i <= pageNum; i++) {
			String activeClass = "";
			if(page == i){
				activeClass = "class=\"active\"";
			}
			pageStr.append("<li "+activeClass+"><a href=\"/lprodList?page="+i+"&pageSize="+pageSize+"\">"+i+"</a></li>");
		}
		
	    // 다음으로 버튼
		pageStr.append("<li><a href=\"/lprodList?page="+nextPage+"&pageSize="+pageSize
				+"\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>");
	    
		
		return pageStr.toString();
	}

}
