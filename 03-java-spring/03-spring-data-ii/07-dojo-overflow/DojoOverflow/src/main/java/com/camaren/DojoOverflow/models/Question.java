package com.camaren.DojoOverflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

@Entity
@Table(name="questions")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ques;
	@Transient
	private String TagsFromPage;
	@OneToMany(mappedBy="quest", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Answer> answers;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="qus_tg", joinColumns = @JoinColumn(name="quest_id"), inverseJoinColumns = @JoinColumn(name="tg_id"))
	private List<Tag> tagForQus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getTagsFromPage() {
		return TagsFromPage;
	}
	public void setTagsFromPage(String getTagsFromPage) {
		this.TagsFromPage = getTagsFromPage;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public List<Tag> getTagForQus() {
		return tagForQus;
	}
	public void setTagForQus(List<Tag> tagForQus) {
		this.tagForQus = tagForQus;
	}
	public Question() {
		
	}
	
	
	
}
