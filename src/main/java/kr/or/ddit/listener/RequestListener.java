package kr.or.ddit.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestListener implements ServletRequestListener {
	
	private Logger logger = LoggerFactory.getLogger(RequestListener.class);

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		logger.debug("requestListener URI destroyed : "+ ((HttpServletRequest)sre.getServletRequest()).getRequestURI());
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		logger.debug("requestListener URI init : "+ req.getRequestURI());
		
	}

	
	
}
