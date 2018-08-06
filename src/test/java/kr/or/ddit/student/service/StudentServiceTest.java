package kr.or.ddit.student.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.student.dao.StudentDao;
import kr.or.ddit.student.dao.StudentDaoInf;
import kr.or.ddit.student.model.StudentVo;

import org.junit.Before;
import org.junit.Test;

public class StudentServiceTest {
	
	/*
	@Before --> @Test --> @After
	
	테스트 메소드안에 중복되는 내용 : StudentDao 구현체에 대한 생성 로직
	--> @Before 어노테이션이 붙은 setUp 메소드에 위임
	
	모든 테스트 메소드에서 StudentDao 객체를 참조할 수 있게끔 클래스 변수로 생성할 필요가 있고
	클래스 변수를 setUp메서드에서 초기화하는 로직이 필요
	테스트 메소드에서 StudentDao를 생성하는 로직은 삭제
	*/
	
	StudentServiceInf studentService;
	int id;
	StudentVo stdVo;
	Map<String, Integer> map;
	
	@Before
	public void setUp(){
		studentService = new StudentService();
		
		id = 24;
		stdVo = new StudentVo();
		stdVo.setId(24);
		
		map = new HashMap<String, Integer>();
		map.put("page", 2);
		map.put("pageSize", 10);
	}

	/**
	* Method : selectAllStudentsTest
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 전체 회원 정보 조회
	*/
	@Test
	public void selectAllStudentsTest() {
		/***Given***/		

		/***When***/
		List<StudentVo> studentList = studentService.selectAllStudents();
		
//		System.out.println("service");
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
		StudentVo studentVo = studentService.getStudent(id);
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
		StudentVo studentVo = studentService.getStudent(stdVo);
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
		Map<String, Object> resultMap = studentService.getStudentPageList(map);
		
		// 학생 페이지 리스트
		List<StudentVo> stdList = (List<StudentVo>)resultMap.get("stdList");
		
		// 전체 학생 수
		int totcnt = (int)resultMap.get("totCnt");		

		/***Then***/
		assertEquals(10, stdList.size());	// 학생 페이지 리스트 수에 대한 검증
		assertEquals(25, totcnt);			// 전체 학생 수에 대한 검증

	}
	
	/**
	* Method : calculatePageNavi
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : 전체 건수를 인자로 페이지 네비게이션 사이즈를 구하는 테스트
	*/
	@Test
	public void calculatePageNavi(){
		/***Given***/
		int totCnt = 25;
		int pageSize = 10;
		
		int cnt = totCnt/pageSize;
		int mod = totCnt% pageSize;
		
		if (mod>0)
			cnt++;

		/***When***/
		System.out.println(Math.round(totCnt/pageSize));

		/***Then***/

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
		int updateCnt = studentService.studentUpdate(stdVo);

		/***Then***/
		assertEquals(1, updateCnt);

	}
	

}
