package com.app.category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.category.entity.Category;

@Repository
public interface CategoryReposirtory extends CrudRepository<Category,String> {

}
