/**
 * 
 */
package com.zhu.learn.tools.response;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Zhu
 * @date 2016年7月8日 下午2:47:38
 * @description
 */
public interface RequestResponseHolder {

	public HttpServletRequest getRequest();

	public HttpServletResponse getResponse();
}
