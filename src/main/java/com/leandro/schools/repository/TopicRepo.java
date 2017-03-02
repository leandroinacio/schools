package com.leandro.schools.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leandro.schools.model.Topic;

public interface TopicRepo extends JpaRepository<Topic, Long>{

}
