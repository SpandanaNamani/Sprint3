package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@PostMapping("/post")
	public Product addProducts(@RequestBody Product product) {
		
		return productservice.addproduct(product);
	}
	
	@PutMapping("/update")
	public Product update(@RequestHeader String prodname, @RequestBody Product product) {

		return productservice.updateproduct(prodname, product);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String prodname) {
		productservice.deleteproduct(prodname);
		return "data deleted";
	}
	
}
