package com.spring.hibernate.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.model.Product;
import com.spring.hibernate.repository.ProductRepository;

@Service

public class ProductRepoService {
	@Autowired
	ProductRepository repo;
	
	public List<Product> getList()
	{
		return repo.findAll();
	}

}
