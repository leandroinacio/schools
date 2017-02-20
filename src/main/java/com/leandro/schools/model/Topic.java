package com.leandro.schools.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Topic implements Serializable{

	public static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "topic",fetch = FetchType.EAGER)
    private List<Question> questions;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(Long id, String name, Long topic) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + "]";
	}
	
}