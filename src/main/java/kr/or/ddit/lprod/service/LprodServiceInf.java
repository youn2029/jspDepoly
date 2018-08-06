package kr.or.ddit.lprod.service;

import java.util.Map;

public interface LprodServiceInf {
	
	/**
	* Method : getPageLprod
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @param pageMap
	* @return
	* Method 설명 : lprod 페이지네이션 조회
	*/
	Map<String, Object> getPageLprod(Map<String, Integer> pageMap);

}
