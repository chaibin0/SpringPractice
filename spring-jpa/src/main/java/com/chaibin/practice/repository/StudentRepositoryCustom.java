package com.chaibin.practice.repository;

import com.chaibin.practice.model.StudentDto1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryCustom {

    @PersistenceContext
    private final EntityManager entityManager;

    public List<StudentDto1> queryTest(LocalDate target, Long id) {
        return entityManager.createNativeQuery("SELECT :target, name FROM tb_student WHERE id = :id")
                .setParameter("target", target)
                .setParameter("id", id)
                .getResultList();
    }
}
