package com.example.testthymeleafwebapp.dao;

import com.example.testthymeleafwebapp.entity.Student;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
