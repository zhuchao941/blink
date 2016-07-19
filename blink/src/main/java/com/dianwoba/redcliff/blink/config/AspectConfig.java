/**
 * 
 */
package com.dianwoba.redcliff.blink.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhu.learn.tools.response.ResponseJsonAspect;

/**
 * @author Zhu
 * @date 2016年7月8日 下午5:22:21
 * @description
 */
@Configuration
public class AspectConfig {

	@Bean(name = "responseJsonAspect")
	public ResponseJsonAspect responseJsonAspect() {
		return new ResponseJsonAspect();
	}
}
