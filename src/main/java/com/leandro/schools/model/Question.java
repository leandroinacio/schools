package com.leandro.schools.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Question implements Serializable{

	public static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String question;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
    private Topic topic;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "question",fetch = FetchType.EAGER)
    private List<Option> options;
	
	public Question() {
		super();
		this.options = new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}
	
	public Question(Long id, String question, List<Option> options) {
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

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
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
