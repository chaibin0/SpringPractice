package com.chaibin.practice.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;



@Getter
@Entity(name = "tb_student")
public class Student {

    @Id
    private Long id;

}
