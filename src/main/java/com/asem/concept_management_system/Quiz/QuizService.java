package com.asem.concept_management_system.Quiz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class QuizService {
    @Value("${quizapi.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public QuizService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Quiz> getQuizzesByCategory(String category, int limit) {
        String url = UriComponentsBuilder
                .fromHttpUrl("https://quizapi.io/api/v1" + "/questions")
                .queryParam("category", category)
                .queryParam("limit", limit)
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Api-Key", apiKey);

        HttpEntity<Void> request = new HttpEntity<>(headers);

        ResponseEntity<Quiz[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                Quiz[].class
        );

        return Arrays.asList(Objects.requireNonNull(response.getBody()));
    }
}
