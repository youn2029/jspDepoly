package kr.or.ddit.student.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.student.model.StudentVo;
import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceInf;

import org.junit.Before;
import org.junit.Test;

public class StudentDaoTest {
	
	StudentDaoInf studentDao;
	int id;
	StudentVo stdVo;
	Map<String, Integer> map;
	
	@Before
	public void setUp(){
		studentDao = new StudentDao();	
		
		id = 24;
		stdVo = new StudentVo();
		stdVo.setId(id);
		
		map = new HashMap<String, Integer>();
		map.put("page", 3);
		map.put("pageSize", 10);
	}

	/**
	* Method : selectAllStudentsTest
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 전체 학생 정보를 조회
	*/
	@Test
	public void selectAllStudentsTest() {
		/***Given***/

		/***When***/
		List<StudentVo> studentList = studentDao.selectAllStudents();		
		
//		System.out.println("dao");
//		for (StudentVo stdVo : studentList) {
//			System.out.println(stdVo);
//		}

		/***Then***/
		assertEquals(25, studentList.size());

	}
	
	/**
	* Method : getStudentId
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : id로 특정 학생 정보 조회
	*/
	@Test
	public void getStudentIdTest(){		
		/***Given***/

		/***When***/
		StudentVo studentVo = studentDao.getStudent(id);
//		System.out.println(studentVo);
		

		/***Then***/
		assertEquals("윤성호", studentVo.getName());		
	}
	
	/**
	* Method : getStudentVo
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : studentVod의 id로 특정 학생 정보 조회
	*/
	@Test
	public void getStudentVoTest(){		
		/***Given***/

		/***When***/
		StudentVo studentVo = studentDao.getStudent(stdVo);
//		System.out.println(studentVo);

		/***Then***/
		assertEquals("윤성호", studentVo.getName());

	}
	
	/**
	* Method : getStudentPageListTest
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 학생 페이지 리스트 조회
	*/
	@Test
	public void getStudentPageListTest(){
		/***Given***/		

		/***When***/
		List<StudentVo> stdList = studentDao.getStudentPageList(map);
		for (StudentVo stdVo : stdList) {
			System.out.println(stdVo);
		}

		/***Then***/
		assertEquals(5, stdList.size());

	}
	
	/**
	* Method : getStudentTotCntTest
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 전체 학생 수 조회
	*/
	@Test
	public void getStudentTotCntTest(){
		/***Given***/		

		/***When***/
		int totalCnt = studentDao.getStudentTotCnt();

		/***Then***/
		assertEquals(25, totalCnt);

	}
	
	/**
	* Method : studentUpdateTest
	* 최초작성일 : 2018. 7. 17.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 학생 정보 수정
	*/
	@Test
	public void studentUpdateTest(){
		/***Given***/
		stdVo.setId(24);
		stdVo.setName("윤성호");
		stdVo.setAddr1("대전광역시 중구 중앙로 76");
		stdVo.setAddr2("영민빌딩 2층 대덕인재개발원");
		stdVo.setZipcd("34940");
		stdVo.setPic("icebear.jpg");
		stdVo.setPicpath("D:\\A_TeachingMaterial\\7.JspSpring\\fileUpload");
		stdVo.setPicname("cf98023b-4adb-4c00-a0ff-8d4b3551021e");

		/***When***/
		int updateCnt = studentDao.studentUpdate(stdVo);

		/***Then***/
		assertEquals(1, updateCnt);

	}
	

}
