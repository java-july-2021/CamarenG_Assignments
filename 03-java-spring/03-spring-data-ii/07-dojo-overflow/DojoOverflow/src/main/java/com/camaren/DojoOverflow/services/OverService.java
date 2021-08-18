package com.camaren.DojoOverflow.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camaren.DojoOverflow.models.Answer;
import com.camaren.DojoOverflow.models.Question;
import com.camaren.DojoOverflow.models.Tag;
import com.camaren.DojoOverflow.repository.AnswRepo;
import com.camaren.DojoOverflow.repository.QuesRepo;
import com.camaren.DojoOverflow.repository.TagRepo;

@Service
public class OverService {
@Autowired
private QuesRepo qusRepo;
@Autowired
private AnswRepo ansRepo;
@Autowired 
private TagRepo tgRepo;


public ArrayList<Tag> sepTags(String tags){
	ArrayList<Tag> tagForQues = new ArrayList<Tag>();
	for(String spTgs : tags.split(", "))
		if(this.tgRepo.existsByTag(spTgs)) {
			tagForQues.add(this.getSingTag(tags));
		}
		else {
			Tag nwTg = new Tag();
			nwTg.setTag(spTgs);
			this.tgRepo.save(nwTg);
			tagForQues.add(this.getSingTag(spTgs));
		}
	return tagForQues;
}



public Question makeQuest(Question question) {
	question.setTagForQus(this.sepTags(question.getTagsFromPage()));
	return this.qusRepo.save(question);
}

public Answer addAs(Answer answer) {
	return this.ansRepo.save(answer);
}

public List<Question> getQus(){
	return this.qusRepo.findAll();
}

public Question findSingQus(Long id) {
	return this.qusRepo.findById(id).orElse(null);
}

public Tag getSingTag(String tag) {
	return this.tgRepo.findByTag(tag);
}


}
