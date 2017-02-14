package com.leandro.schools.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.schools.model.ClassRoom;

public interface ClassRoomRepo extends JpaRepository<ClassRoom, Long>{

}
