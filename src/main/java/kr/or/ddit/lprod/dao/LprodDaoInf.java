package kr.or.ddit.lprod.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVO;

public interface LprodDaoInf {	
	
	/**
	* Method : selectAllLprods
	* 최초작성일 : 2018. 7. 9.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 lprod 정보 조회 
	*/
	List<LprodVO> selectAllLprods();
	
	/**
	* Method : getPageLprods
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : lprod 페이지네이션 조회
	*/
	List<LprodVO> getPageLprods(Map<String, Integer> pageMap);
	
	/**
	* Method : getCountLprod
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 lprod 수 조회 
	*/
	int getCountLprod();

}
