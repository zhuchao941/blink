/**
 * 
 */
package com.dianwoba.redcliff.blink.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dianwoba.redcliff.blink.entity.User;

/**
 * @author Zhu
 * @date 2016年7月16日 下午6:52:50
 * @description 
 */
public interface UserMapperExt {
	
	@Select("SELECT * FROM `user` WHERE id = #{id}")
	User findById(@Param("id") Integer id);
}
