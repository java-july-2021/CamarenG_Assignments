package com.camaren.Languages.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camaren.Languages.models.Lang;

public interface Repo extends CrudRepository<Lang, Long>{
	List<Lang> findAll();
}