package kr.or.ddit.cookie.util;

public class CookieUtil {

	/**
	* Method : getCookie
	* 최초작성일 : 2018. 7. 6.
	* 작성자 : PC04
	* 변경이력 :
	* @param cookie
	* @param name
	* @return
	* Method 설명 : 쿠키 조회
	*/
	public String getCookie(String cookie, String name) {
		
		//cookie : userId=brown; rememberMe=y; checkYn=n
		String[] cookies = cookie.split("; ");
		String result = "";
		
//		for (int i = 0; i < cookies.length; i++) {
//			String[] cookies2 = cookies[i].split("=");
//			if (cookies2[0].equals(name)) {
//				result = cookies2[1];
//				break;
//			}
//		}
		
		for (String str : cookies) {
			if (str.substring(0,6).equals(name)) {
				result = str.substring(7);
			}
		}
		
		return result;
	}

}
