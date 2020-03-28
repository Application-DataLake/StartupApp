package com.app.test.nested.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	@GetMapping(value = "/test")
	public  MappingJacksonValue getTest() {
		TestVO vo = testService.getTestVO();
		MappingJacksonValue  jacksonValue= new MappingJacksonValue(vo);
		SimpleBeanPropertyFilter filter1 = SimpleBeanPropertyFilter.filterOutAllExcept("value1","jacksonValue");
		SimpleFilterProvider providers = new  SimpleFilterProvider()
				.addFilter("testFilter", filter1);
		jacksonValue.setFilters(providers);
		return jacksonValue;
	}
}
