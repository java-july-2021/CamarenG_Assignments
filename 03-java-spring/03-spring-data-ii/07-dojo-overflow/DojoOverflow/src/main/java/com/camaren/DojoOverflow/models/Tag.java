package com.camaren.DojoOverflow.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="tags")
public class Tag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String tag;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="qus_tg", joinColumns = @JoinColumn(name="tg_id"), inverseJoinColumns = @JoinColumn(name="quest_id"))
	private List<Question> allQuest;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public List<Question> getAllQuest() {
		return allQuest;
	}
	public void setAllQuest(List<Question> allQuest) {
		this.allQuest = allQuest;
	}
	public Tag() {
		
	}
	
	
	
	
}
