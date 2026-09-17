package com.elsevier.pubquiz;

import java.util.Scanner;

final class AnswerReader {
    private AnswerReader() { }

    static int read(Scanner scanner) {
        while (true) {
            System.out.print("> ");
            if (!scanner.hasNext()) {
                System.out.println("\nNo more input. Goodbye!");
                System.exit(0);
            }
            String input = scanner.next().trim().toUpperCase();
            if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                return input.charAt(0) - 'A';
            }
            try {
                int number = Integer.parseInt(input);
                if (number >= 1 && number <= 4) return number - 1;
            } catch (NumberFormatException ignored) {
                // Fall through to the friendly validation message.
            }
            System.out.println("Please enter A, B, C, or D (or 1, 2, 3, or 4).");
        }
    }
}
