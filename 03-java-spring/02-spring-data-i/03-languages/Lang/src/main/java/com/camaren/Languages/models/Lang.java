package com.camaren.Languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")

public class Lang {
	
	//name of creator, name of language, version
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=2, max=20)
	private String creator;
	@NotNull
	
	private String codeLang;
	@Size(min=2, max=20)
	private String currentVersion;
	@NotNull


	public Lang() {
		//is left empty on purpose
	}
	
	


	public Lang(Long id, String creator, @NotNull String codeLang,
			@Size(min = 2, max = 20) String currentVersion) {
		
		this.id = id;
		this.creator = creator;
		this.codeLang = codeLang;
		this.currentVersion = currentVersion;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}


	public String getCodeLang() {
		return codeLang;
	}


	public void setCodeLang(String codeLang) {
		this.codeLang = codeLang;
	}


	public String getCurrentVersion() {
		return currentVersion;
	}


	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
	
	

}
