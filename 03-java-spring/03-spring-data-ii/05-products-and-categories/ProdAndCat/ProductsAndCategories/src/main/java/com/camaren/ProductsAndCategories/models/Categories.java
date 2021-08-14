package com.camaren.ProductsAndCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="categories")

public class Categories {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@Column(updatable=false)
private Date created;
private Date updated;
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name="cat_prods", joinColumns = @JoinColumn(name = "cat_id"), inverseJoinColumns = @JoinColumn(name ="prod_id"))
	private List<Products> products;
	
	public Categories() {
		//leave this empty
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public List<Products> getProducts() {
		return this.products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
	
}
