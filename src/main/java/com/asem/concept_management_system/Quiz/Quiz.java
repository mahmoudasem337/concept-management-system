package com.asem.concept_management_system.Quiz;

import java.util.Map;

public class Quiz {
    private String question;
    private String description;
    private String category;
    private String difficulty;
    private Map<String, String> answers;
    private Map<String, Boolean> correct_answers;

    public Quiz() {
    }

    public Quiz( String question, String description, String category, String difficulty, Map<String, String> answers, Map<String, Boolean> correct_answers) {
        this.question = question;
        this.description = description;
        this.category = category;
        this.difficulty = difficulty;
        this.answers = answers;
        this.correct_answers = correct_answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

    public Map<String, Boolean> getCorrect_answers() {
        return correct_answers;
    }

    public void setCorrect_answers(Map<String, Boolean> correct_answers) {
        this.correct_answers = correct_answers;
    }
}
