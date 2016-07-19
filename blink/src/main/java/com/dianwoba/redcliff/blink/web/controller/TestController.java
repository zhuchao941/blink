/**
 * 
 */
package com.dianwoba.redcliff.blink.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu
 * @date 2016年7月19日 下午2:57:57
 * @description
 */
@RestController
public class TestController {

	@RequestMapping("test")
	public String test() {
		return "test998";
	}
}
