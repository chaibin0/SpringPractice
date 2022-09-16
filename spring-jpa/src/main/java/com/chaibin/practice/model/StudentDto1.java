package com.chaibin.practice.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;


@Getter
public class StudentDto1 {

    private LocalDate target;

    private String name;

    @Builder
    public StudentDto1(LocalDate target, String name) {
        this.target = target;
        this.name = name;
    }
}
