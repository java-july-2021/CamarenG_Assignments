package com.camaren.DojoNinjas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camaren.DojoNinjas.models.Dojo;
import com.camaren.DojoNinjas.models.Ninja;
import com.camaren.DojoNinjas.repository.NinjaRepo;
import com.camaren.DojoNinjas.repository.Repo;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepo ninja;
	private Repo dojo;
	//-----------------------------
	
	public List<Dojo> allDojo(){
		return this.dojo.findAll();
	}
	
	public List<Ninja> allNinja(){
		return this.ninja.findAll();
	}
	
	//--------------
	public NinjaService(NinjaRepo ninjaRep) {
		ninja = ninjaRep;
	}
	
	public Ninja makeNinja (Ninja ninja) {
		return this.ninja.save(ninja);
	}
	
	public void deltById(Long Id) {
		this.ninja.deleteById(Id);
	}
	
	public Ninja update(Ninja ninja) {
		return this.ninja.save(ninja);
	}
	public Ninja oneNinja(Long id) {
		return this.ninja.findById(id).orElse(null);
	}
}
