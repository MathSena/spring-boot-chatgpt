package com.mathsena.springbootchatgpt.services;

import reactor.core.publisher.Mono;

public interface StudyNotesService {
    Mono<String> createStudyNotes(String topic);
}
