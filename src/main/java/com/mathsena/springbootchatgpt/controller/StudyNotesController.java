package com.mathsena.springbootchatgpt.controller;

import com.mathsena.springbootchatgpt.services.StudyNotesServiceChatGPT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class StudyNotesController {
    
    @Autowired
    private StudyNotesServiceChatGPT serviceChatGPT;

    
    @PostMapping("study-notes")
    public Mono<String> createStudyNotes(@RequestBody String topic){
        return serviceChatGPT.createStudyNotes(topic);
        
    }
}
