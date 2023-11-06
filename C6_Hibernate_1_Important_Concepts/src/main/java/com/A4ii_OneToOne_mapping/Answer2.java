package com.A4ii_OneToOne_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer2 {
	
	@Id
	private int answerId;
	private String answer;
	@OneToOne(mappedBy= "Question2")
	private Question2 question;
	
	public Answer2() {
	
	}

	public Answer2(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question2 getQuestion() {
		return question;
	}

	public void setQuestion(Question2 question) {
		this.question = question;
	}
	
	
}
