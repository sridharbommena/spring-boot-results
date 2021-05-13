package com.sridhar.results;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sridhar.results.model.Result;
import com.sridhar.results.service.ResultService;

@RestController
public class ResultController {
	
	@Autowired
	private ResultService resultService;
	
	@PostMapping("/result")
	public List<Result> getResults(@ModelAttribute("htno") String htno)
	{
		return resultService.getResult(htno);
	}

}
