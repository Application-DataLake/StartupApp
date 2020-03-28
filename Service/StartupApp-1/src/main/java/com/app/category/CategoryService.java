package com.app.category;

import java.util.ArrayList;
import java.util.List;

import com.app.category.entity.Category;
import com.app.exception.ApplicationException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CategoryService {
	
	private CategoryReposirtory categoryReposirtory;

	public CategoryService( CategoryReposirtory categoryReposirtory) {
		this.categoryReposirtory = categoryReposirtory;
	}
	
	public List<Category>  getAllCategories() {
		log.debug("Inside getAllCategories");
		List<Category> categories = new ArrayList<Category>();
		categoryReposirtory.findAll().forEach(vo -> categories.add(vo));;
		if(categories.size()==0)
			throw new ApplicationException("No Cateegories found");
		return categories;
	}
	
	public Category saveCategory(Category category) {
		log.info("inside saveCategory");
		return categoryReposirtory.save(category);
	}
	
	public void deleteCategory(Category category){
		categoryReposirtory.delete(category);
	}
	

}
