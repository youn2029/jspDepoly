package kr.or.ddit.student.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.student.model.StudentVo;

public interface StudentDaoInf {
	
	/**
	* Method : selectAllStudents
	* 최초작성일 : 2018. 7. 9.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 학생 정보를 조회
	*/
	List<StudentVo> selectAllStudents();
	
	/**
	* Method : getStudent
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* @param id
	* @return
	* Method 설명 : id로 특정 학생 정보 조회
	*/
	StudentVo getStudent(int id);
	
	/**
	* Method : getStudent
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* @param studentVo
	* @return
	* Method 설명 : studentVod의 id로 특정 학생 정보 조회
	*/
	StudentVo getStudent(StudentVo studentVo);
	
	/**
	* Method : getStudentPageList
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC04
	* 변경이력 :
	* @param map
	* @return
	* Method 설명 : 학생 페이지 리스트 조회
	*/
	List<StudentVo> getStudentPageList(Map<String, Integer> map);
	
	/**
	* Method : getStudentTotcnt
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC04
	* 변경이력 :
	* @return
	* Method 설명 : 전체 학생 수 조회
	*/
	int getStudentTotCnt();
	
	/**
	* Method : studentUpdate
	* 최초작성일 : 2018. 7. 17.
	* 작성자 : PC04
	* 변경이력 :
	* @param studentVo
	* @return
	* Method 설명 : 학생 정보 수정
	*/
	int studentUpdate(StudentVo studentVo);

}
