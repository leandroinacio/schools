package com.leandro.schools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leandro.schools.model.ClassRoom;
import com.leandro.schools.repository.ClassRoomRepo;

@Controller
public class ClassRoomController {

	@Autowired
	private ClassRoomRepo classRoomRepo;
	
	@PostMapping("/fetchAllClasses")
	public @ResponseBody List<ClassRoom> fetchAllClasses() {
		return classRoomRepo.findAll();
	}
	
	@PostMapping("/fetchClassById")
	public @ResponseBody ClassRoom fetchClassById(Long id) {
		return classRoomRepo.findOne(id);
	}
	
	@PostMapping("/insertClass")
	public @ResponseBody ClassRoom insertClass(String name) {
		ClassRoom classRoom = new ClassRoom(0L, name, 0L);
		return classRoomRepo.save(classRoom);
	}
	
	@PostMapping("/updateClass")
	public @ResponseBody ClassRoom updateClass(Long id, String name, Long topic) {
		ClassRoom classRoom = classRoomRepo.findOne(id);
		classRoom.setName(name);
		classRoom.setTopic(topic);
		return classRoomRepo.save(classRoom);
	}
	
	@PostMapping("/deleteClass")
	public @ResponseBody Boolean deleteClass(Long id) {
		classRoomRepo.delete(id);
		return true;
	}
	
}
