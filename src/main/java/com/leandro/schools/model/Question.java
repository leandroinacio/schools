package com.leandro.schools.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Question implements Serializable{

	public static final long serialVersionUID = 1L;
	
	private Long id;
	private String question;
	private List<String> options;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(Long id, String question, List<String> options) {
		super();
		this.id = id;
		this.question = question;
		this.options = options;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", options=" + options + "]";
	}

}
