package com.vox.drei;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddQuestionTest {

    @Test
    void addQuestion() {
        Quiz quiz = new Quiz("Algebra", "Mathematics");

        // Create questions & add them to the quiz
        Question question1 = new Question(
                "What is 3 + 3?",
                Arrays.asList("1", "3", "4", "6"),
                "6", "MULTIPLE_CHOICE"
        );
        Question question2 = new Question(
                "What is the capital of Iraq?",
                Arrays.asList("Berlin", "Baghdad", "Madrid", "Moscow"),
                "Baghdad", "MULTIPLE_CHOICE"
        );

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);

        // Verify the first question is added and the question number is correct
        assertEquals(
                2,
                quiz.getQuestions().size(),
                "The number of questions in the quiz should be 2"
        );
        assertEquals(
                question1,
                quiz.getQuestions().get(0),
                "The first question should be the same as the one added"
        );
        assertEquals(
                1,
                quiz.getQuestions().get(0).getQuestionNumber(),
                "The question number should be 1"
        );

        // Verify the second question is added and the question number is correct
        assertEquals(
                question2, quiz.getQuestions().get(1),
                "The second question should be the same as the one added"
        );
        assertEquals(
                2,
                quiz.getQuestions().get(1).getQuestionNumber(),
                "The question number should be 2"
        );
    }
}
