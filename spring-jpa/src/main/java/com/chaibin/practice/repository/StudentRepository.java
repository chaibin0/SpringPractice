package com.chaibin.practice.repository;

import com.chaibin.practice.entity.Student;
import com.chaibin.practice.model.StudentDto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("""
                SELECT 
                    cast(:target as date) as target, 
                    D.name as name 
                FROM Student as D 
                WHERE D.id = :id
            """)
    List<StudentDto1> queryTest(@Param("target") LocalDate target, @Param("id") String id);
}
