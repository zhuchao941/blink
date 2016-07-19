/**
 * 
 */
package com.dianwoba.redcliff.blink.config;

import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Zhu
 * @date 2016年7月18日 下午1:26:32
 * @description
 */
@ConfigurationProperties(prefix = MybatisProperties2.MYBATIS_PREFIX)
public class MybatisProperties2 extends MybatisProperties {
	public static final String MYBATIS_PREFIX = "mybatis2";
}
