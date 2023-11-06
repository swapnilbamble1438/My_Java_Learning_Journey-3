package com.A5_Cascading;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer3 {
	
	@Id
	private int answerId;
	private String answer;

	@ManyToOne
	private Question3 question;
	
	public Answer3() {
	
	}

public Answer3(int answerId, String answer) {
		
		this.answerId = answerId;
		this.answer = answer;
	
	}

	public Answer3(int answerId, String answer, Question3 question) {
		
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

	public Question3 getQuestion() {
		return question;
	}

	public void setQuestion(Question3 question) {
		this.question = question;
	}
	
	
}
