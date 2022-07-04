package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Paese;
import com.boglia.repos.PaeseDAO;

@Service
public class PaeseServiceImpl implements PaeseService {

	@Autowired
	private PaeseDAO dao;
	
	
	@Override
	public Paese addPaese(Paese p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public List<Paese> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
