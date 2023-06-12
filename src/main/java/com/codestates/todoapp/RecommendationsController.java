package com.codestates.todoapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@ResponseBody
@RestController
public class RecommendationsController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";

    }
}
