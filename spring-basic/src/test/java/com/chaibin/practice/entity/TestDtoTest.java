package com.chaibin.practice.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TestDtoTest {

    /*
        테스트코드에서는 TestDto.innerBuilder를 접근할 수 있지만
        다른 메소드에서는 접근할 수 없음
     */
    @Test
    @DisplayName("builder 필수값 테스트")
    void test_builder() {

        long id = 1L;
        String name = "이름";
        String description = "설명";

        TestDto testDto = TestDto.builder(id, name)
                .description(description)
                .build();

        assertThat(testDto.getId()).isEqualTo(1L);
        assertThat(testDto.getName()).isEqualTo("이름");
        assertThat(testDto.getDescription()).isEqualTo("설명");
    }
}