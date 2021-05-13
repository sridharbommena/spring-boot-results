package com.sridhar.results.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sridhar.results.model.Result;
import com.sridhar.results.repository.ResultsRepo;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultsRepo resultRepo;

	@Override
	public List<Result> getResult(String htno) {
		return resultRepo.getResults(htno);
	}
	
}
