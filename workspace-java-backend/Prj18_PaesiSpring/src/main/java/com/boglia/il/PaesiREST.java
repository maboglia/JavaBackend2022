package com.boglia.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Paese;
import com.boglia.services.PaeseService;

@RestController
@RequestMapping("api")
public class PaesiREST {

	@Autowired
	private PaeseService service;
	
	@GetMapping
	@CrossOrigin
	public List<Paese> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	@CrossOrigin
	public Paese addPaese(@RequestBody Paese p) {
		System.out.println("--------------------------------------");
		System.out.println(p.getBandiera());
		return service.addPaese(p);
	}
	
	
	
}
