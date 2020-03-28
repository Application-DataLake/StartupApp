package com.app.product;

import java.util.List;

import com.app.product.VO.UserProductRequestVO;
import com.app.product.entity.Product;

public class ProductServiceImpl {
	
	private ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Iterable<Product> getProducts(UserProductRequestVO requestVO){
		return productRepository.findAll();
	}

	public List<Product> getProductsForCategory(String userId, String category){
		return null;
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}


	public List<Product> getProductsForCategory(String categoryId){
		return productRepository.findProductsByCategoryId(categoryId);
	}
	
}
