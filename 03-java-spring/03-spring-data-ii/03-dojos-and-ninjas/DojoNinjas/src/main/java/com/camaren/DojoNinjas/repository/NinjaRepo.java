package com.camaren.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camaren.DojoNinjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
List<Ninja> findAll();
	
	
}
