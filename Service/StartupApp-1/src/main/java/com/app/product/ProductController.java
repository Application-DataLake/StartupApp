package com.app.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.product.VO.UserProductRequestVO;
import com.app.product.entity.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProductController {
	
	private ProductServiceImpl productService;
	
	public ProductController(ProductServiceImpl productService) {
		this.productService = productService;
	}
	
	@PostMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts(@RequestBody UserProductRequestVO requestVo){
		log.info("Entering getProducts");
		log.info("UserId passed : {}", requestVo.getUserId());
		log.info("Category passed : {}", requestVo.getCategoryIds());
		List<Product> products = new ArrayList<Product>();
		productService.getProducts(requestVo).forEach(products::add); 
		return products;
	}
	
	@PutMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product getProducts(@RequestBody Product product){
		log.info("Entering getProducts");
		
		return productService.saveProduct(product);
	}
	
	@GetMapping(value = "/products/{categoryId}")
	public List<Product> getProductsfoCategory(@PathVariable("categoryId") String categoryId){
		log.info("Entering getProducts");
		log.info("Category passed : {}", categoryId);
		return productService.getProductsForCategory( categoryId);
	}
	
	

}
