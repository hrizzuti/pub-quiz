package com.elsevier.pubquiz;

import java.util.ArrayList;
import java.util.List;

public final class QuestionBank {
    private QuestionBank() { }

    public static List<Question> questions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(Theme.AI, "What does AI stand for?",
                List.of("Automated Internet", "Artificial Intelligence", "Applied Information", "Algorithmic Interface"), 1));
        questions.add(new Question(Theme.AI, "Which approach learns patterns from examples?",
                List.of("Machine learning", "Manual sorting", "Static linking", "Data printing"), 0));
        questions.add(new Question(Theme.AI, "What is a prompt usually used for with a generative AI system?",
                List.of("To provide an instruction or request", "To restart a computer", "To compress a file", "To measure network speed"), 0));

        questions.add(new Question(Theme.ELSEVIER, "Elsevier is best known as a provider of what?",
                List.of("Scholarly information and analytics", "Airline tickets", "Supermarket deliveries", "Mobile phones"), 0));
        questions.add(new Question(Theme.ELSEVIER, "Which group is most likely to use a research article database?",
                List.of("Researchers", "Train conductors", "Film stunt teams", "Pastry chefs only"), 0));
        questions.add(new Question(Theme.ELSEVIER, "What is a DOI primarily used to provide?",
                List.of("A persistent identifier for a digital object", "A paper size", "A password", "A programming language"), 0));

        questions.add(new Question(Theme.INDIA, "What is the capital of India?",
                List.of("Mumbai", "New Delhi", "Kolkata", "Bengaluru"), 1));
        questions.add(new Question(Theme.INDIA, "Which script is commonly used to write Hindi?",
                List.of("Devanagari", "Cyrillic", "Greek", "Hangul"), 0));
        questions.add(new Question(Theme.INDIA, "Which Indian city is often called the Silicon Valley of India?",
                List.of("Jaipur", "Bengaluru", "Agra", "Pune"), 1));

        questions.add(new Question(Theme.SDD, "In Spec-Driven Development, a specification should primarily describe what?",
                List.of("What the system should do", "Every line of implementation code", "The team's lunch order", "Only the project history"), 0));
        questions.add(new Question(Theme.SDD, "What is a useful purpose of reviewing a spec before implementation?",
                List.of("Find ambiguity and missing requirements", "Replace all automated tests", "Choose a colour scheme", "Avoid talking to users"), 0));
        questions.add(new Question(Theme.SDD, "What should happen when the implementation and the spec disagree?",
                List.of("Investigate the difference and establish the current truth", "Ignore both", "Delete the tests", "Always add more pages of documentation"), 0));

        questions.add(new Question(Theme.FRANCE, "What is the capital of France?",
                List.of("Lyon", "Paris", "Nice", "Bordeaux"), 1));
        questions.add(new Question(Theme.FRANCE, "Which landmark is in Paris?",
                List.of("The Eiffel Tower", "The Colosseum", "The Acropolis", "Big Ben"), 0));
        questions.add(new Question(Theme.FRANCE, "Which of these is a French greeting?",
                List.of("Bonjour", "Ciao", "Hola", "Guten Tag"), 0));

        questions.add(new Question(Theme.BRITAIN, "What is the capital of the United Kingdom?",
                List.of("Manchester", "London", "Edinburgh", "Cardiff"), 1));
        questions.add(new Question(Theme.BRITAIN, "Which sport is traditionally associated with Lord's?",
                List.of("Cricket", "Rugby", "Curling", "Fencing"), 0));
        questions.add(new Question(Theme.BRITAIN, "What is a common name for a British tea break?",
                List.of("A brew", "A siesta", "A merienda", "A fika"), 0));

        return List.copyOf(questions);
    }
}
