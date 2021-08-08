package com.camaren.DojoNinjas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.camaren.DojoNinjas.models.Dojo;
import com.camaren.DojoNinjas.repository.Repo;

@Service
public class DojoService {

	private Repo dojo;
	
	
	public DojoService(Repo dojoRep) {
		dojo =dojoRep;
	}
	
	public List<Dojo> allDojo(){
		return this.dojo.findAll();
	}
	
	
	
	public Dojo create(Dojo dojo) {
		return this.dojo.save(dojo);
	}
	
	public void delById(Long id) {
		this.dojo.deleteById(id);
	}
	
	public Dojo update(Dojo dojo) {
		return this.dojo.save(dojo);
	}
	
	public Dojo oneDojo(Long id) {
		return this.dojo.findById(id).orElse(null);
	}
}
