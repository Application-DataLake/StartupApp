package com.app.test.nested.filter;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("testVO2Filter")
public class TestVO2 {
	
	private String value6;
	private String value7;
	private String value8;
	private String value9;

}
