package com.leandro.schools.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="classrooms")
public class ClassRoom implements Serializable{

	public static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Long topic;
	
	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(Long id, String name, Long topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
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

	public Long getTopic() {
		return topic;
	}

	public void setTopic(Long topic) {
		this.topic = topic;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + ", topic=" + topic + "]";
	}
	
}
