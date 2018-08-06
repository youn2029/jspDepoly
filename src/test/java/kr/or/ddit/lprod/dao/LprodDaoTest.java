package kr.or.ddit.lprod.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVO;

import org.junit.Before;
import org.junit.Test;

public class LprodDaoTest {
	
	LprodDaoInf lprodDao;
	
	@Before
	public void setUp(){
		lprodDao = new LprodDao();
	}
	

	/**
	* Method : selectAllLprods
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : lprod 정보 전체 조회
	*/
	@Test
	public void selectAllLprods() {
		/***Given***/		

		/***When***/
		List<LprodVO> lprodList = lprodDao.selectAllLprods();
		
		for (LprodVO lprodVo : lprodList) {
			System.out.println(lprodVo);
		}

		/***Then***/
		assertEquals(12, lprodList.size());

	}
	
	@Test
	public void getPageLprodsTest(){
		/***Given***/
		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("page", 1);
		pageMap.put("pageSize", 5);
		
		/***When***/
		List<LprodVO> lprodPageList = lprodDao.getPageLprods(pageMap);
		for (LprodVO lpVo : lprodPageList) {
			System.out.println(lpVo);
		}

		/***Then***/
		assertEquals(5, lprodPageList.size());

	}
	
	@Test
	public void getCountLprodTest(){
		/***Given***/		

		/***When***/
		int cnt = lprodDao.getCountLprod();

		/***Then***/
		assertEquals(12, cnt);

	}
	

}
