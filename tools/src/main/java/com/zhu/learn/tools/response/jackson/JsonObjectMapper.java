package com.zhu.learn.tools.response.jackson;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 自定义JSON解析器
 * 
 * @author Zhu
 * @date 2015-5-14
 * @version 0.0.1
 * @description
 */
public class JsonObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 4101422916858447072L;

	/**
	 * 返回JSON结果，处理null为空和格式化日期
	 */
	public JsonObjectMapper() {
		super();

		this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object value, JsonGenerator generator, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				generator.writeString("");
			}
		});
		this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}
}
