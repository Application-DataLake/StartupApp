package com.app.product;

import java.util.List;
import java.util.stream.Collectors;

import com.app.product.entity.Product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductServiceImpl implements IProductService {
	private List<Product> products;
	
	@Override
	public List<Product> getProducts(){
		return products;
	}
	
	@Override
	public List<Product> getProducts(String userId, String category){
		return products
				.parallelStream()
				.filter( product -> product.getUserId().equals(userId) && product.getCategory().contentEquals(category))
				.collect(Collectors.toList());
	}

}
