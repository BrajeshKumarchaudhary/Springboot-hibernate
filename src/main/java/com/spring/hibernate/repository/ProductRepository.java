package com.spring.hibernate.repository;

import java.util.List;


import com.spring.hibernate.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
