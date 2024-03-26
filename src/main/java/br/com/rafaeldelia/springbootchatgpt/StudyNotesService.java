package br.com.rafaeldelia.springbootchatgpt;

import reactor.core.publisher.Mono;

public interface StudyNotesService {
  Mono<String> createStudyNotes(String topic);
}
