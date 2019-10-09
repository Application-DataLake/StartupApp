package com.app.product;

import java.util.List;

import com.app.product.entity.Product;

public interface IProductService {
	
	public List<Product> getProducts();
	public List<Product> getProducts(String userId, String category);

}
