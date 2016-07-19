/**
 * 
 */
package com.dianwoba.redcliff.blink.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.DriverManagerDataSource;

/**
 * @author Zhu
 * @date 2016年7月15日 下午5:37:06
 * @description
 */
@Configuration
public class DataSourceConfig {

	@ConfigurationProperties(prefix = "datasource.a")
	@Bean(name = "aDataSource")
	public DataSource aDataSource() {
		return new DriverManagerDataSource();
	}
	
	@ConfigurationProperties(prefix = "datasource.b")
	@Bean(name = "bDataSource")
	public DataSource bDataSource() {
		return new DriverManagerDataSource();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(@Qualifier("aDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
