/**
 * 
 */
package com.zhu.learn.tools.response.jackson;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;

import com.zhu.learn.tools.response.ResponseWriter;

/**
 * @author Zhu
 * @date 2016年7月8日 下午3:12:45
 * @description
 */
public class DefaultResponseWriter implements ResponseWriter {

	private MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(
			new JsonObjectMapper());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zhu.learn.tools.response.ResponseWriter#write(javax.servlet.http.
	 * HttpServletResponse, java.lang.Object)
	 */
	@Override
	public void write(HttpServletResponse response, Object data) throws HttpMessageNotWritableException, IOException {
		HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
		converter.write(data, MediaType.APPLICATION_JSON, outputMessage);
	}
}
