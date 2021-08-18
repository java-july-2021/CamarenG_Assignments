package com.camaren.DojoOverflow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camaren.DojoOverflow.models.Answer;

@Repository
public interface AnswRepo extends CrudRepository<Answer, Long>{

}
