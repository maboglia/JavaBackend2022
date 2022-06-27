package com.boglia.wimbledon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.wimbledon.dao.TennistaDAO;
import com.boglia.wimbledon.model.Tennista;

@RestController
@RequestMapping("api/tennisti")
public class TennistaREST {

	@Autowired
	private TennistaDAO dao;
	
	@GetMapping
	public List<Tennista> getAll(){
		return dao.findAll();
	}
	
	
}
