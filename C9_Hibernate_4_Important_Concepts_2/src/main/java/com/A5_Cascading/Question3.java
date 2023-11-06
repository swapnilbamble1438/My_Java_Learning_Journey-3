package com.A5_Cascading;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question3 {

	@Id	
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Answer3> answer;
	
	public Question3() {
		
	}

	public Question3(int questionId, String question, List<Answer3> ans) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = ans;
	}

	public int getQuestionId() {
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

	public List<Answer3> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer3> answer) {
		this.answer = answer;
	}

	
	
	
}
