package com.spring.hibernate.dao;

import com.spring.hibernate.model.Product;

import antlr.collections.List;

public interface ProductDao {
	public List getProduct(Long id) ;

	public Product save(Product product);

	public Product updateProduct(Product product) ;

	public String deleteProduct(long id) ;
	
	public List getAllProduct() ;
}
