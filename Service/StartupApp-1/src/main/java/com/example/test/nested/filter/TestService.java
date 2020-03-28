package com.app.test.nested.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public TestVO getTestVO() {
		TestVO2 testVO2 = new TestVO2();
		testVO2.setValue6("6");
		testVO2.setValue7("7");
		testVO2.setValue8("8");
		testVO2.setValue9("9");
		
		TestVO testVO = new TestVO();
		testVO.setValue1("1");
		testVO.setValue2("2");
		testVO.setValue3("3");
		testVO.setValue4("4");
		testVO.setValue5("5");
		testVO.setValue10(testVO2);
		List<String> fields = new ArrayList<String>();
		fields.add("value6");
		fields.add("value7");
		testVO.setFields(fields);
		return testVO;
	}
}
