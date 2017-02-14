package com.leandro.schools.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.schools.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
