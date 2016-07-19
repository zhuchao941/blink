/**
 * 
 */
package com.zhu.learn.tools.response;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.converter.HttpMessageNotWritableException;

/**
 * @author Zhu
 * @date 2016年7月8日 下午2:56:30
 * @description
 */
public interface ResponseWriter {

	public void write(HttpServletResponse response, Object data) throws HttpMessageNotWritableException, IOException;

}
