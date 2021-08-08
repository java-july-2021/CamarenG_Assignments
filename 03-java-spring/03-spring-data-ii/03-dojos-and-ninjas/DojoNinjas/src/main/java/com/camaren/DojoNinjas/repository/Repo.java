package com.camaren.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camaren.DojoNinjas.models.Dojo;

public interface Repo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
