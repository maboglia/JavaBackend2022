package com.boglia.services;

import java.util.List;

import com.boglia.entities.Paese;

public interface PaeseService {

	Paese addPaese(Paese p);
	List<Paese> getAll();
	
}
