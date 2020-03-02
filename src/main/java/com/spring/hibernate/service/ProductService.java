package com.spring.hibernate.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.daoimpl.ProdaoImpl;
import com.spring.hibernate.model.Product;
import com.spring.hibernate.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProdaoImpl productdao;
	
	public Product addProduct(Product product) {
		Product id = productdao.save(product);
		return id;
	}
	public List getProduct(long id) {
		List list = (List) productdao.getProduct(id);
		return list;
	}
	public List getAllProduct(long id) {
		List list = (List) productdao.getProduct(id);
		return list;
	}
	
	public Product updateProduct(Product product) {
		Product list = productdao.updateProduct(product);
		return list;
	}
	public String DeleteProduct(long id) {
		String list = productdao.deleteProduct(id);
		return list;
	}
	/*
	 * Get md5 from mysql
	 */
	public String getToken() {
		
		String token = productdao.getToken();
		return token;
	}
	
	
	
}



