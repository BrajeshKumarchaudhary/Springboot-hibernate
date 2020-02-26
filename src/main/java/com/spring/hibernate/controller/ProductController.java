package com.spring.hibernate.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.model.Product;
import com.spring.hibernate.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;

	@GetMapping("/")
	public Product home() {
		Product id = null;
		try {
			Product prdct = new Product("Mango", "fruit", "Brajesh", new Date(1), new Date(1));
			id = productservice.addProduct(prdct);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return id;
	}

	@GetMapping("/delete")
	public String delete() {
		String result = null;
		try {
			result = productservice.DeleteProduct(1);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return result;
	}
	
	@GetMapping("/get")
	public List getProduct() {
		List result = null;
		try {
			result = productservice.getProduct(1);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return result;
	}
	
	@GetMapping("/getAll")
	public List getProductAll() {
		List result = null;
		try {
			result = productservice.getAllProduct(1);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return result;
	}
	@GetMapping("/update")
	public Product updateProduct() {
		Product result = null;
		Product prdct = new Product("Mango", "fruit", "Brajesh", new Date(1), new Date(1));
		try {
			result = productservice.updateProduct(prdct);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return result;
	}
	
	
}
