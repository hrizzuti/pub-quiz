package com.elsevier.pubquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizGame {
    private final List<Question> questions;
    private int score;
    private int questionNumber;

    public QuizGame(List<Question> questions) {
        this.questions = new ArrayList<>(questions);
    }

    public void shuffle() {
        Collections.shuffle(questions);
    }

    public Question nextQuestion() {
        if (questionNumber >= questions.size()) {
            throw new IllegalStateException("The quiz is complete");
        }
        return questions.get(questionNumber++);
    }

    public boolean answer(Question question, int answer) {
        boolean correct = question.isCorrect(answer);
        if (correct) score++;
        return correct;
    }

    public int score() { return score; }
    public int totalQuestions() { return questions.size(); }
    public int questionsAsked() { return questionNumber; }
}
