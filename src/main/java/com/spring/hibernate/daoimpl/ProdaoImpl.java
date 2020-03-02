package com.spring.hibernate.daoimpl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.hibernate.dao.ProductDao;
import com.spring.hibernate.model.Product;

import antlr.collections.List;
@Component
public class ProdaoImpl implements ProductDao {
	@Autowired
      SessionFactory sessionfactory;
	  @Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		  Session session = sessionfactory.openSession();
		  session.beginTransaction();
		  long id = (Long) session.save(product);
		  session.getTransaction().commit();
		  return product;
	}

	@Override
	public List getProduct(Long id) {
		Session session = this.sessionfactory.getCurrentSession();
		List product = (List) session.get(Product.class, id);
		return product;

	}
	
	public List getAllProduct() {
		Session session = this.sessionfactory.getCurrentSession();
		List productList = (List)session.createQuery("from Product").list();
		return productList;
	}
	

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Hibernate.initialize(product);
		session.update(product);
		return product;
		
	}

	@Override
	public String deleteProduct(long id) {
		// TODO Auto-generated method stub
		String result="null";
		Session session = this.sessionfactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Long(id));
		if (null != p) {
			session.delete(p);
			result="deleted";
		}
		return result;
		
	}
	public String getToken()
	{
		Session session = this.sessionfactory.getCurrentSession();
		String m5="";
		java.util.List result =session.getNamedQuery("{MyDb.getMd5(pass,email)}")
				.setParameter("pass", "xyz")
				 .setParameter("email", "xyz")
			    .list(); // named parameters are better
		
		for(int i=0; i<result.size(); i++){
			m5 =result.get(i).toString();
		}
		return m5;
	}

}
