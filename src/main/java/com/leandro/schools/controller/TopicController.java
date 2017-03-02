package com.leandro.schools.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leandro.schools.model.Topic;
import com.leandro.schools.repository.TopicRepo;

@Controller
public class TopicController {

	@Autowired
	private TopicRepo topicRepo;
	
	@PostMapping("/fetchAllTopics")
	public @ResponseBody List<Topic> fetchAllTopics() {
		return topicRepo.findAll();
	}
	
	@PostMapping("/fetchTopicById")
	public @ResponseBody Topic fetchTopicById(Long id) {
		return topicRepo.findOne(id);
	}
	
	@PostMapping("/insertTopic")
	public @ResponseBody Topic insertTopic(String name) {
		Topic topic = new Topic(0L, name);
		return topicRepo.save(topic);
	}
	
	@PostMapping("/updateTopic")
	public @ResponseBody Topic updateTopic(Long id, String name) {
		Topic topic = topicRepo.findOne(id);
		topic.setName(name);
		return topicRepo.save(topic);
	}
	
	@PostMapping("/deleteTopic")
	public @ResponseBody Boolean deleteTopic(Long id) {
		topicRepo.delete(id);
		return true;
	}
}
