/**
 * 
 */
package com.dianwoba.redcliff.blink.web.filter;

import java.util.Map;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.stereotype.Component;

/**
 * @author Zhu
 * @date 2016年7月18日 下午4:26:27
 * @description 
 */
@Component
public class MyServletContextInitializer implements ServletContextInitializer{

	/* (non-Javadoc)
	 * @see org.springframework.boot.context.embedded.ServletContextInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("start up");
		Map<String, ? extends FilterRegistration> map = servletContext.getFilterRegistrations();
		System.out.println(map);
	}
}
