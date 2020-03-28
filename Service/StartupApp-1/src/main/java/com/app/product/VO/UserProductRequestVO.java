package com.app.product.VO;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserProductRequestVO {
	
	private String userId;
	private List<String> categoryIds;
	Map<String, String> filters;

}
