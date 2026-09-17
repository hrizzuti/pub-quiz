package com.elsevier.pubquiz;

import java.util.List;

public final class Question {
    private final Theme theme;
    private final String text;
    private final List<String> options;
    private final int correctOption;

    public Question(Theme theme, String text, List<String> options, int correctOption) {
        if (options.size() != 4 || correctOption < 0 || correctOption >= options.size()) {
            throw new IllegalArgumentException("A question must have four options and a valid answer");
        }
        this.theme = theme;
        this.text = text;
        options = List.copyOf(options);
        this.options = options;
        this.correctOption = correctOption;
    }

    public Theme theme() { return theme; }
    public String text() { return text; }
    public List<String> options() { return options; }
    public int correctOption() { return correctOption; }

    public boolean isCorrect(int answer) {
        return answer == correctOption;
    }
}
