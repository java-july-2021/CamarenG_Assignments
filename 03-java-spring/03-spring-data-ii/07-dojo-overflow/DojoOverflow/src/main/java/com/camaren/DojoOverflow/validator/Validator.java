package com.camaren.DojoOverflow.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.camaren.DojoOverflow.models.Question;

@Component
public class Validator {
public void validate(Object target, Errors errors) {
	Question question = (Question) target;
	
	String[] tags = question.getTagsFromPage().split(", ");
	if(tags.length > 5) {
		errors.rejectValue("tagsFromPage", "to many", "Whats the point of having tags if your going to add every tag in the world?!?");
	}
}
}
