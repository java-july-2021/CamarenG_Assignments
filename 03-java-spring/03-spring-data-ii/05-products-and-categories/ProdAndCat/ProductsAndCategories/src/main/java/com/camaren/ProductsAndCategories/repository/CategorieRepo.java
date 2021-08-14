package com.camaren.ProductsAndCategories.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camaren.ProductsAndCategories.models.Categories;

public interface CategorieRepo extends CrudRepository<Categories, Long>{

	List<Categories> findAll();

}
