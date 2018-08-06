package kr.or.ddit.encrypt.kisa.seed;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KISA_SEED_CBC_Test {

	private Logger logger = LoggerFactory.getLogger(KISA_SEED_CBC_Test.class);
	
	/**
	* Method : encrytTest
	* 최초작성일 : 2018. 7. 18.
	* 작성자 : PC04
	* 변경이력 :
	* Method 설명 : kisa seed 블록 암호화 테스트
	*/
	@Test
	public void encrytTest() {
		// 블록 암호화는 비밀번호를 제외한 개인 정보를 암호화 할때 사용
		// 복호화가 가능한 암호 방식
		
		/***Given***/
		String plainText = "1234";

		/***When***/
		String encryptText = KISA_SEED_CBC.Encrypt(plainText);		// 암호화			
		String dencryptText = KISA_SEED_CBC.Decrypt(encryptText);	// 복호화

		logger.debug("encryptText : " + encryptText);
		logger.debug("dencryptText : " + dencryptText);
		
		/***Then***/
		assertEquals(encryptText, dencryptText);

	}

}
