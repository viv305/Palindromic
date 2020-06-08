package com.odx.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.odx.test.model.Test;

@Repository
public interface TestRepository extends CrudRepository<Test, Long>{

	Test findByName(String input);

}
