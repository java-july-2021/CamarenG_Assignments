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
@Table(name="products")
public class Products {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String description;
private float price;
@Column(updatable=false)
private Date created;
private Date updated;
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "cat_prods", joinColumns = @JoinColumn(name="prod_id"), inverseJoinColumns = @JoinColumn(name = "cat_id"))

	private List<Categories> categories;


	public Products() {
		//Leave this empty
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
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


	public List<Categories> getCategories() {
		return categories;
	}


	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	
	
}
