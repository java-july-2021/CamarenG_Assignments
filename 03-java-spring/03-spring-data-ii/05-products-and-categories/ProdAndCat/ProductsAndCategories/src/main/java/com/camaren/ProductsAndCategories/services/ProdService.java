package com.camaren.ProductsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.camaren.ProductsAndCategories.models.Categories;
import com.camaren.ProductsAndCategories.models.Products;
import com.camaren.ProductsAndCategories.repository.ProductRepo;

@Service
public class ProdService {

	private ProductRepo prods;
	
	public ProdService(ProductRepo prodRep) {
		prods = prodRep;
	}
	
	public List<Products> allProducts(){
		return this.prods.findAll();
	}
	
	public Products createPro(Products products) {
		return this.prods.save(products);
	}
	
	public Products getOneProd(Long id) {
		return this.prods.findById(id).orElse(null);
	}
	public List<Products> findProdsNotInCats(Categories categories){
		return this.prods.findByCategoriesNotContains(categories);
	}
	
	
}
