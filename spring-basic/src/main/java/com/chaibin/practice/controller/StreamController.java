package com.chaibin.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;

@RestController
public class StreamController {

    @GetMapping("/stream/test1")
    public void getStreamController(HttpServletResponse response) {
        try (OutputStreamWriter outputStream = new OutputStreamWriter(response.getOutputStream())) {
            outputStream.write("문자");
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
