package com.chaibin.practice.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Entity
@Table(name = "tb_student")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDay;

    private LocalDateTime createdAt;

    private String createdBy;

    @Builder
    public Student(Long id, String name, LocalDate birthDay, LocalDateTime createdAt, String createdBy) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
}
