package com.chaibin.practice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(StreamController.class)
class StreamControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getStreamController() throws Exception {
        MockHttpServletResponse httpServletResponse = new MockHttpServletResponse();

        httpServletResponse.setOutputStreamAccessAllowed(true);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new ByteArrayInputStream(mockMvc.perform(get("/stream/test1"))
                                .andReturn()
                                .getResponse()
                                .getContentAsByteArray())));

        assertThat(br.readLine()).isEqualTo("문자");

    }
}