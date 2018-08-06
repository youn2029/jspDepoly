package kr.or.ddit.lprod.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.mybatis.SqlMapSessionFactory;

public class LprodDao implements LprodDaoInf {
	
	private SqlSessionFactory sqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory();

	/**
	* Method : selectAllLprods
	* 최초작성일 : 2018. 7. 9.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 lprod 정보 조회
	*/
	@Override
	public List<LprodVO> selectAllLprods() {
		SqlSession session = sqlSessionFactory.openSession();
		List<LprodVO> lprodList = session.selectList("lprod.selectAllLprods");
		session.close();
		
		return lprodList;
	}

	/**
	* Method : getPageLprods
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : lprod 페이지네이션 조회
	*/
	@Override
	public List<LprodVO> getPageLprods(Map<String, Integer> pageMap) {
		SqlSession session = sqlSessionFactory.openSession();
		List<LprodVO> lprodPageList = session.selectList("lprod.getPageLprods", pageMap);
		session.close();
		
		return lprodPageList;
	}

	/**
	* Method : getCountLprod
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 lprod 정보 수 조회
	*/
	@Override
	public int getCountLprod() {
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = session.selectOne("lprod.getCountLprod");
		session.close();
		
		return cnt;
	}	

}
