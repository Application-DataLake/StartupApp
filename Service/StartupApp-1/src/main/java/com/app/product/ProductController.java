package com.app.product;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.product.entity.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProductController {
	
	private IProductService productService;
	
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts(@RequestBody Product product){
		log.info("Entering getProducts");
		log.info("UserId passed : {}", product.getUserId());
		log.info("Category passed : {}", product.getCategory());
		return productService.getProducts(product.getUserId(), product.getCategory());
	}

}
