package kr.or.ddit.file;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	/**
	* Method : getFileNameTest
	* 최초작성일 : 2018. 7. 16.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : part의 Content-Disposition header로 부터 업로드 파일명을 리턴한다.
	*/
	@Test
	public void getFileNameTest() {
		/***Given***/

		/***When***/
		String result = FileUtil.getFileName("form-data; name=\"uploadFile\"; filename=\"icebear.jpg\"");
		System.out.println(result);

		/***Then***/
		assertEquals("icebear.jpg", result);

	}

}
