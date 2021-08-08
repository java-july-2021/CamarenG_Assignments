package com.camaren.DojoNinjas.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dojos")
public class Dojo {
	
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String dojoName;

@OneToMany(mappedBy="dojo", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
private List<Ninja> ninjas;


public List<Ninja> getNinjas() {
	return this.ninjas;
}


public Dojo() {
	//Leave it empty
}

public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getDojoName() {
	return dojoName;
}


public void setDojoName(String dojoName) {
	this.dojoName = dojoName;
}


public void setNinjas(List<Ninja> ninjas) {
	this.ninjas = ninjas;
}


}
