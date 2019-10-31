package com.app.category;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.category.entity.Category;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/category")
public class CategoryController {
	
	private CategoryService categoryService;
	
	
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public List<Category> getCategories() {
		return categoryService.getAllCategories();
	}
	
	@PostMapping
	public Category saveCategories(@RequestBody Category category) {
		log.info("Input Category = {}", category);
		return categoryService.saveCategory(category);
	}

}
