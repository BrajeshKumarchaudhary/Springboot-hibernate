package com.spring.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	public Product(String name, String categeory, String inserBy, Date created_dt, Date updated_dt) {
		this.name = name;
		this.categeory = categeory;
		this.inserBy = inserBy;
		this.created_dt = created_dt;
		this.updated_dt = updated_dt;
	}
	@Column(name="product_name")
	public String name;
	@Column(name="cat")
	public String categeory;
	@Column(name="insertby")
	public String inserBy;
	public Date created_dt;
	public Date updated_dt;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategeory() {
		return categeory;
	}
	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}
	public String getInserBy() {
		return inserBy;
	}
	public void setInserBy(String inserBy) {
		this.inserBy = inserBy;
	}
	public Date getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", categeory=" + categeory + ", inserBy=" + inserBy
				+ ", created_dt=" + created_dt + ", updated_dt=" + updated_dt + "]";
	}
	
}
