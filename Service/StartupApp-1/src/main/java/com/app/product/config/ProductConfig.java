package com.app.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.product.ProductRepository;
import com.app.product.ProductServiceImpl;

@Configuration
public class ProductConfig {
	
	@Bean
	public ProductServiceImpl getProductService(ProductRepository productRepository) {
		/*Product p1 = new Product("1", "Automobile","1", "VolksWagon Polo");
		Product p2 = new Product("2", "Electronics","1","Macbook");
		Product p3 = new Product("3", "Automobile","1","Honda CBR 800");
		Product p4 = new Product("4", "Automobile","1","Mybike");
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		*/
		return new ProductServiceImpl(productRepository);
		
	}

}
