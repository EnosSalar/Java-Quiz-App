package com.vox.drei;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveQuestionTest {

    @Test
    void removeQuestion() {
        // Create a quiz
        Quiz quiz = new Quiz("Sample Quiz", "General Knowledge");

        // Create questions
        Question question1 = new Question("What is 2 + 2?", Arrays.asList("3", "4", "5"), "4", "MCQ");
        Question question2 = new Question("What is the capital of France?", Arrays.asList("Berlin", "Paris", "Madrid"), "Paris", "MCQ");
        Question question3 = new Question("What is the largest planet?", Arrays.asList("Earth", "Jupiter", "Mars"), "Jupiter", "MCQ");

        // Add questions
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        // Remove the second question
        quiz.removeQuestion(question2);

        // Verify the size of the questions list
        assertEquals(2, quiz.getQuestions().size());

        // Verify the remaining questions
        assertTrue(quiz.getQuestions().contains(question1));
        assertTrue(quiz.getQuestions().contains(question3));

        // Verify the question numbers are updated
        assertEquals(1, quiz.getQuestions().get(0).getQuestionNumber());
        assertEquals(2, quiz.getQuestions().get(1).getQuestionNumber());
    }
}
