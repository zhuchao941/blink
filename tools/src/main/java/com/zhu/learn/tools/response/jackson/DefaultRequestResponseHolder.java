/**
 * 
 */
package com.zhu.learn.tools.response.jackson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zhu.learn.tools.response.RequestResponseHolder;

/**
 * @author Zhu
 * @date 2016年7月8日 下午3:10:45
 * @description
 */
public class DefaultRequestResponseHolder implements RequestResponseHolder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhu.learn.tools.response.RequestResponseHolder#getRequest()
	 */
	@Override
	public HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhu.learn.tools.response.RequestResponseHolder#getResponse()
	 */
	@Override
	public HttpServletResponse getResponse() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
	}

}
