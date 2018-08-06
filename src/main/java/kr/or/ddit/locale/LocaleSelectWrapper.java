package kr.or.ddit.locale;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class LocaleSelectWrapper extends HttpServletRequestWrapper{
	
	private Map<String, String[]> map;

	public LocaleSelectWrapper(HttpServletRequest request) {
		super(request);
		
		// 기존 request 객체의 파라미터 map을 복사
		map = new HashMap<String, String[]>(request.getParameterMap());
		
		String[] locales = map.get("locale");
		
		if(locales== null || locales[0].equals("")){
			map.put("locale", new String[]{"ja"});
		}
	}

	// 파라미터의 name에 해당하는 값
	@Override
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		if(values != null)
			return values[0];
		else
			return null;
	}

	// 파라미터의 모든 값
	@Override
	public Map<String, String[]> getParameterMap() {
		return map;
	}

	// 파라미터의 name들
	@Override
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(map.keySet());
	}

	// 파라미터의 name에 해당하는 값들
	@Override
	public String[] getParameterValues(String name) {
		return map.get(name);
	}

}
