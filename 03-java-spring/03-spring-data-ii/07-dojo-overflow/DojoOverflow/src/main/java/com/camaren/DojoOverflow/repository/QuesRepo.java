package com.camaren.DojoOverflow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camaren.DojoOverflow.models.Question;

public interface QuesRepo extends CrudRepository<Question, Long>{
List<Question> findAll();
}
