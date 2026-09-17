package com.elsevier.pubquiz;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class Main {
    private Main() { }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n🍻 ELSEVIER PUB QUIZ 🍻");
        System.out.println("Choose a theme:");
        Theme[] themes = Theme.values();
        for (int i = 0; i < themes.length; i++) {
            System.out.printf("%d. %s%n", i + 1, themes[i].displayName());
        }
        int choice = readNumber(scanner, 1, themes.length);
        Theme selected = themes[choice - 1];

        List<Question> selectedQuestions = QuestionBank.questions().stream()
                .filter(question -> selected == Theme.ALL || question.theme() == selected)
                .collect(Collectors.toList());
        QuizGame game = new QuizGame(selectedQuestions);
        game.shuffle();

        System.out.printf("\nTheme: %s — %d questions%n%n", selected.displayName(), game.totalQuestions());
        while (game.questionsAsked() < game.totalQuestions()) {
            Question question = game.nextQuestion();
            System.out.printf("%d. %s%n", game.questionsAsked(), question.text());
            for (int i = 0; i < question.options().size(); i++) {
                System.out.printf("   %s. %s%n", (char) ('A' + i), question.options().get(i));
            }
            int answer = readNumber(scanner, 1, 4) - 1;
            if (game.answer(question, answer)) {
                System.out.println("✅ Correct!\n");
            } else {
                System.out.printf("❌ Not quite. The answer was %s.%n%n", (char) ('A' + question.correctOption()));
            }
        }
        System.out.printf("Quiz complete! Final score: %d/%d%n", game.score(), game.totalQuestions());
        System.out.println(verdict(game.score(), game.totalQuestions()));
    }

    private static int readNumber(Scanner scanner, int minimum, int maximum) {
        while (true) {
            System.out.print("> ");
            if (!scanner.hasNext()) {
                System.out.println("\nNo more input. Goodbye!");
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= minimum && value <= maximum) return value;
            } else if (scanner.hasNext()) {
                scanner.next();
            }
            System.out.printf("Please enter a number from %d to %d.%n", minimum, maximum);
        }
    }

    static String verdict(int score, int total) {
        if (score == total) return "🏆 Perfect score — you are quizmaster material!";
        if (score * 2 >= total) return "👏 Solid work — round of applause!";
        return "☕ Keep practising — the next round is yours.";
    }
}
