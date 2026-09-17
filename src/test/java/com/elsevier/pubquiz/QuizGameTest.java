package com.elsevier.pubquiz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuizGameTest {
    @Test
    void correctAnswersIncreaseTheScore() {
        Question question = QuestionBank.questions().get(0);
        QuizGame game = new QuizGame(List.of(question));

        assertTrue(game.answer(game.nextQuestion(), question.correctOption()));
        assertEquals(1, game.score());
    }

    @Test
    void incorrectAnswersDoNotIncreaseTheScore() {
        Question question = QuestionBank.questions().get(0);
        QuizGame game = new QuizGame(List.of(question));

        assertFalse(game.answer(game.nextQuestion(), (question.correctOption() + 1) % 4));
        assertEquals(0, game.score());
    }

    @Test
    void allSixThemesHaveQuestions() {
        List<Question> questions = QuestionBank.questions();
        for (Theme theme : List.of(Theme.AI, Theme.ELSEVIER, Theme.INDIA, Theme.SDD, Theme.FRANCE, Theme.BRITAIN)) {
            assertTrue(questions.stream().anyMatch(question -> question.theme() == theme));
        }
    }
}
