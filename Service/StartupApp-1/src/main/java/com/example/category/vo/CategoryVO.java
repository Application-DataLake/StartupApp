package com.app.category.vo;

import java.io.Serializable;

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
public class CategoryVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -953109445427398383L;
	
	private String categoryId;
	private String categoryName;
	

}
