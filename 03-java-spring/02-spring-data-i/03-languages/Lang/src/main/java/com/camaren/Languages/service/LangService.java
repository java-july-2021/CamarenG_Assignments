package com.camaren.Languages.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.camaren.Languages.models.Lang;
import com.camaren.Languages.repository.Repo;

@Service
public class LangService {

	private final Repo lang;
	
	
	public LangService(Repo langRep) {
		lang = langRep;
	}
	
	public List<Lang> allLang(){
		return lang.findAll();
	}
	
	public Lang findLang(Long id) {
		return lang.findById(id).orElse(null);
	}
	
	public Lang makeLang(Lang newLang) {
		return lang.save(newLang);		
	}
	
	public Lang updtLang(Lang upLang) {
		return this.lang.save(upLang);
	}
	
	public void removeLang(Long id) {
		this.lang.deleteById(id);
	}
}
