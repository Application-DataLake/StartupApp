package com.app.category.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.category.CategoryReposirtory;
import com.app.category.CategoryService;

@Configuration
public class CategoryConfig {
	
	@Bean
	public CategoryService categoryService(CategoryReposirtory categoryReposirtory) {
		return new CategoryService( categoryReposirtory);
	}

}
