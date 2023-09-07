package com.example.demo.service;

import com.example.demo.entity.Product;

public interface ProductService {

	Product addproduct(Product product);
	
	Product updateproduct(String prodname,Product product);
	
	void deleteproduct(String prodname);
}
