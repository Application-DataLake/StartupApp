package com.app.test.nested.filter;

import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("testFilter")
public class TestVO {
	private String value1;
	private String value2;
	private String value3;
	private String value4;
	private String value5;
	
	@JsonIgnore
	private List<String> fields;

	@Getter(AccessLevel.NONE)
	private TestVO2 value10;
	
	private MappingJacksonValue jacksonValue;
	
	public TestVO2 getValue10() {
		MappingJacksonValue  jacksonValue= new MappingJacksonValue(this.value10);
		SimpleBeanPropertyFilter filter1 = SimpleBeanPropertyFilter.filterOutAllExcept(this.fields.toArray(new String[this.fields.size()]));
		SimpleFilterProvider providers = new  SimpleFilterProvider()
				.addFilter("testVO2Filter", filter1);
		jacksonValue.setFilters(providers);
		this.jacksonValue = jacksonValue;
		return this.value10;
	}
	

}
