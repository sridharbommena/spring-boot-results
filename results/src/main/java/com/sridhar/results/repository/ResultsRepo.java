package com.sridhar.results.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sridhar.results.model.Result;

public interface ResultsRepo extends JpaRepository<Result, Integer> {
	
	@Query("SELECT r FROM Result r WHERE r.htno=?1")
	public List<Result> getResults(String htno);

}
