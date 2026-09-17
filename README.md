# Elsevier Pub Quiz

A small Java terminal quiz for an SDD knowledge-sharing session. It includes question banks on AI, Elsevier, India, Spec-Driven Development (SDD), France, and Britain.

## Run it

Requires Java 11 or later and Gradle.

```bash
gradle test
gradle build
gradle run
```

## Breakout exercise

The starter game is intentionally simple. Each group should choose one feature, create a plan, write and review a spec, implement and test it, then close the spec with only useful documentation retained.

Choose one:

1. **50/50 lifeline** — remove two incorrect answers, usable once per quiz.
2. **Question count** — let the player choose a short, medium, or full-length round.
3. **Leaderboard** — record player names and scores during the current run.
4. **Timed questions** — give the player 15 seconds to answer each question.
5. **Team mode** — let two teams alternate questions and keep separate scores.
6. **Pass token** — allow up to three skipped questions, with a score penalty.

For a 25–30 minute breakout, the 50/50 lifeline or pass token is recommended.
