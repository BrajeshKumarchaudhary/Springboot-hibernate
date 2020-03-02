package com.spring.hibernate.SpringwithHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication   
@ComponentScan(basePackages="com.spring.hibernate")
@EnableJpaRepositories(basePackages="com.spring.hibernate.repository")
@EntityScan(basePackages="com.spring.hibernate.model")
public class SpringwithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwithHibernateApplication.class, args);
	}

}
