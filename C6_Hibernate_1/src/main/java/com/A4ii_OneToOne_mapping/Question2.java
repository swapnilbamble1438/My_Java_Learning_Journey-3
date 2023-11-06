package com.A4ii_OneToOne_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question2 {

	@Id
	
	private int questionId;
	private String question;
	@OneToOne
	// @JoinColumn(name = "aid") for renaming column
	private Answer2 answer;
	
	public Question2() {
		
	}

	public Question2(int questionid, String question, Answer2 answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionid() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer2 getAnswer() {
		return answer;
	}

	public void setAnswer(Answer2 answer) {
		this.answer = answer;
	}
	
	
	
	
}
