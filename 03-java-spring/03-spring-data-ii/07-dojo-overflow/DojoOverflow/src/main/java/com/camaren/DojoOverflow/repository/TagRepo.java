package com.camaren.DojoOverflow.repository;

import org.springframework.data.repository.CrudRepository;

import com.camaren.DojoOverflow.models.Tag;

public interface TagRepo extends CrudRepository<Tag, Long> {
	Tag findByTag(String tag);

	boolean existsByTag(String spTgs);
}
