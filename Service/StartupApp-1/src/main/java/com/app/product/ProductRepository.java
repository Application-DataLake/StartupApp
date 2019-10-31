package com.app.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product,String> {
	
	public List<Product> findProductsByCategoryId(String categoryId);

}
