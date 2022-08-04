package com.chaibin.practice.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


@Getter
@ConstructorBinding
@ConfigurationProperties(prefix = "test1")
public class Test1Properties {

    private LocalDate date;
    private String str;

    public Test1Properties(LocalDate date, String str) {
        this.date = date;
        this.str = str;
    }
}
