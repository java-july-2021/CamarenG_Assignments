package com.camaren.ProductsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.camaren.ProductsAndCategories.models.Categories;
import com.camaren.ProductsAndCategories.models.Products;
import com.camaren.ProductsAndCategories.repository.CategorieRepo;

@Service

public class CatService {

	
	
	private CategorieRepo cats;
	
	
	public CatService(CategorieRepo catRep) {
		cats = catRep;
	}
	
	public List<Categories> allCategories(){
		return this.cats.findAll();
	}
	
	public Categories create(Categories categories) {
		return this.cats.save(categories);
	}
	
	public void addProdToCat(Products products, Categories categories) {
		List<Products> extProds = categories.getProducts();
		extProds.add(products);
		this.cats.save(categories);
	}
	
	public Categories getOneCat(Long id) {
		return this.cats.findById(id).orElse(null);
	}
	
}
