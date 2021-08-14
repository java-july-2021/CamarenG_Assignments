package com.camaren.ProductsAndCategories.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camaren.ProductsAndCategories.models.Categories;
import com.camaren.ProductsAndCategories.models.Products;

public interface ProductRepo extends CrudRepository<Products, Long>{

	List<Products> findAll();
	List<Products> findByCategoriesNotContains(Categories categories);
}
