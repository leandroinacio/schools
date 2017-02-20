package com.leandro.schools.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="options")
public class Option implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
	
	private String option;

	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Option(Long id, Question question, String option) {
		super();
		this.id = id;
		this.question = question;
		this.option = option;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Option [id=" + id + ", questionId=" + question + ", option=" + option + "]";
	}
	
}
