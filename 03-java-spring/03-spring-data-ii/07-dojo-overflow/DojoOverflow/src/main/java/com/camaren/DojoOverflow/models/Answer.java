package com.camaren.DojoOverflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String answ;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="q_id")
private Question quest;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAnsw() {
	return answ;
}
public void setAnsw(String answ) {
	this.answ = answ;
}
public Question getQuest() {
	return quest;
}
public void setQuest(Question quest) {
	this.quest = quest;
}
public Answer() {
	// leave this blank!!!!!!
}
	
	
}
