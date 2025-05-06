package com.asem.concept_management_system.Quiz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Quiz>> getQuizzesByCategory(
            @PathVariable String category,
            @RequestParam(defaultValue = "10") int limit) {
        List<Quiz> quizzes = quizService.getQuizzesByCategory(category, limit);
        return ResponseEntity.ok(quizzes);
    }
}

