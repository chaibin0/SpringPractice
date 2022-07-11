package com.chaibin.practice.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderMethodName = "innerBuilder", access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class TestDto {

    private long id;
    private String name;
    private String description;

    public static TestDtoBuilder builder(long id, String name) {
        return innerBuilder().id(id).name(name);
    }
}
