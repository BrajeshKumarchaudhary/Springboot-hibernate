package com.spring.hibernate.config;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	 @Autowired
	    private EntityManagerFactory entityManagerFactory;
	 @Bean
	    public SessionFactory sessionFactoryProvider() {
	        return entityManagerFactory.unwrap(SessionFactory.class);
	    }
	 
}
