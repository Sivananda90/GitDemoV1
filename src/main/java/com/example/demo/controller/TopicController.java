package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class TopicController {
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("Spring", "SpringBoot" , "SpringBoot Description"),
				new Topic("Java", "Java" , "Java Description"),
				new Topic("JavaScript", "JavaScript" , "JavaScript Description")	);
	}
}
