package com.example.Student.Management.repository;

import com.example.Student.Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
Note:
 1.No need to define the @repository here bcz the "simpleRepository" part of
"JPARepository" already defined with annotation.
 2.By default, it provides transaction all its method.
 **/
public interface StudentRepository extends JpaRepository<Student,Long> {
}
