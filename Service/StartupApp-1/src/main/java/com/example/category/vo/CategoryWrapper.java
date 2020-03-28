package com.app.category.vo;

import java.io.Serializable;
import java.util.List;

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
public class CategoryWrapper  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8206563583223857735L;
	
	private List<CategoryVO> categories;

}
