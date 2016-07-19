/**
 * 
 */
package com.dianwoba.redcliff.blink.web.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.RegistryConfig;
import com.dianwoba.redcliff.blink.entity.User;
import com.dianwoba.redcliff.blink.mapper.UserMapper;
import com.dianwoba.redcliff.blink.mapper.UserMapperExt;
import com.dianwoba.redcliff.blink.mapperb.UserMapperB;
import com.zhu.learn.tools.response.ResponseJson;

/**
 * @author Zhu
 * @date 2016年7月8日 下午4:44:28
 * @description
 */
//@RestController
public class UserController {

	@Resource
	private Environment env;

	@Value("${server.testkey}")
	private String testKey;

	@Resource
	private RegistryConfig registryConfig;

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Resource
	private UserMapper userMapper;

	@Resource
	private UserMapperExt userMapperExt;
	
	@Resource
	private UserMapperB userMapperB;
	
	// @Resource
	// private UserProvider userProvider;

	@RequestMapping("test")
	@ResponseJson
	public ModelMap test() {
		System.out.println(registryConfig);
		System.out.println(env.getProperty("num"));
		System.out.println(testKey);
		// DwdUser user = userProvider.findUserById(1);
		return new ModelMap("user", 1);
	}

	@RequestMapping("test2")
	public String test2(HttpServletRequest request) {
		System.out.println("----------------");
		StringBuffer params = new StringBuffer();
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String p = (String) e.nextElement();
			params.append(p).append("=").append(request.getParameter(p));
			if (e.hasMoreElements()) {
				params.append("&");
			}
		}
		System.out.println(params);
		return "success";
	}

	@RequestMapping("test3")
	public String test3(HttpServletRequest request) {
		String sql = "select * from `user` where id = 392274";
		Map<String, Object> map = jdbcTemplate.query(sql, new ResultSetExtractor<Map<String, Object>>() {
			@Override
			public Map<String, Object> extractData(ResultSet rs) throws SQLException, DataAccessException {
				Map<String, Object> result = new HashMap<>();
				if (rs.next()) {
					result.put("name", rs.getString("name"));
				}
				return result;
			}
		});
		List<Map<String, Object>> list = jdbcTemplate.query("select * from `user` where id in (392274,392273)",
				new RowMapper<Map<String, Object>>() {
					@Override
					public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
						Map<String, Object> result = new HashMap<>();
						result.put("name", rs.getString("name"));
						return result;
					}
				});
		System.out.println(list);
		System.out.println(map);
		return map.toString();
	}
	
	/**
	 * @author Zhu
	 * @date 2016年7月16日 下午4:19:03
	 * @description 
	 */
	@RequestMapping("test4")
	public String test4() {
		User user = userMapper.selectByPrimaryKey(392274);
		System.out.println(user.getName());
		
		user = userMapperExt.findById(392273);
		System.out.println(user.getName());
		
		user = userMapperB.findById(6);
		return user.getName();
	}

	
}
