package com.leandro.schools.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="classrooms")
public class ClassRoom implements Serializable{

	public static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
	private Topic topic;
	
	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(Long id, String name, Topic topic) {
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
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
