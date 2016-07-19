/**
 * 
 */
package com.dianwoba.redcliff.blink.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.dianwoba.redcliff.user.provider.UserProvider;

/**
 * @author Zhu
 * @date 2016年7月9日 下午2:27:33
 * @description
 */
//@Configuration
public class DubboConfig {

	@ConfigurationProperties(prefix = "dubbo.registry")
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registry = new RegistryConfig();
		return registry;
	}

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("blink");
		return applicationConfig;
	}

	@Bean
	public ReferenceBean<UserProvider> userProvider(ApplicationConfig applicationConfig,
			RegistryConfig registryConfig) {
		ReferenceBean<UserProvider> referenceBean = new ReferenceBean<UserProvider>();
		referenceBean.setInterface(UserProvider.class.getName());
		referenceBean.setRegistry(registryConfig);
		referenceBean.setApplication(applicationConfig);
		referenceBean.setVersion("1.0.0");
		return referenceBean;
	}
}
