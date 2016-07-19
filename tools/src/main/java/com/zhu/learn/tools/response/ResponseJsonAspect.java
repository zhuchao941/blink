package com.zhu.learn.tools.response;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import com.zhu.learn.tools.response.jackson.DefaultRequestResponseHolder;
import com.zhu.learn.tools.response.jackson.DefaultResponseWriter;

/**
 * @author Zhu
 * @date 2015-5-18
 * @version 0.0.1
 * @description 负责将返回转换成统一消息格式 序列化为的格式如下: { "status": 1, "data": data, "msg": ""
 *              } 其中被注解的方法只需要关心data的内容即可
 */
@Aspect
@Order(100)
public class ResponseJsonAspect {

	private RequestResponseHolder requestResponseHolder = new DefaultRequestResponseHolder();
	private ResponseWriter responseWriter = new DefaultResponseWriter();

	/**
	 * 拦截所有@ResponseBody
	 * 
	 * @author Zhu
	 * @date 2015-5-18上午11:32:26
	 * @description
	 */
	@Pointcut("execution(* com.dianwoba.redcliff.*.web.controller..*.*(..)) && @annotation(com.zhu.learn.tools.response.ResponseJson)")
	public void responseBodyPointCut() {

	}

	public void before(JoinPoint jp) {
	}

	@AfterReturning(value = "responseBodyPointCut()", returning = "ret")
	public void after(Object ret) throws Exception {
		ResponseJsonBean responseBase = new ResponseJsonBean();
		responseBase.setData(ret);
		HttpServletResponse response = requestResponseHolder.getResponse();
		responseWriter.write(response, responseBase);
		shutdownResponse(response);
	}

	public void exception(JoinPoint jp, Throwable error) throws Throwable {
		HttpServletResponse response = requestResponseHolder.getResponse();
		shutdownResponse(response);
	}

	private void shutdownResponse(HttpServletResponse response) throws IOException {
		response.getOutputStream().close();
	}
}
