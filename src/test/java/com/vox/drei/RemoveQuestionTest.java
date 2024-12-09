package com.vox.drei;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveQuestionTest {

    @Test
    void removeQuestion() {
        Quiz quiz = new Quiz("Geometry", "Mathematics");

        // Create questions & add them to the quiz
        Question question1 = new Question(
                "What is the sum of angles in a triangle?",
                Arrays.asList("90 degrees", "180 degrees", "360 degrees", "None of the above"),
                "180 degrees", "MULTIPLE_CHOICE"
        );
        Question question2 = new Question(
                "What is the area of a circle with radius 5?",
                Arrays.asList("10π", "25π", "20π", "15π"),
                "25π", "MULTIPLE_CHOICE"
        );
        Question question3 = new Question(
                "How many sides does a hexagon have?",
                Arrays.asList("4", "5", "6", "8"),
                "6", "MULTIPLE_CHOICE"
        );

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        // Remove the second question
        quiz.removeQuestion(question2);

        // Verify the size of the quiz's question list is reduced by one
        assertEquals(
                2,
                quiz.getQuestions().size(),
                "The number of questions in the quiz should be 2 after removal"
        );

        // Verify the removed question is no longer in the quiz
        assertFalse(
                quiz.getQuestions().contains(question2),
                "The removed question should not be in the quiz"
        );

        // Verify the remaining questions are still in the quiz
        assertTrue(
                quiz.getQuestions().contains(question1),
                "The first question should still be in the quiz"
        );
        assertTrue(
                quiz.getQuestions().contains(question3),
                "The third question should still be in the quiz"
        );

        // Verify the question numbers are updated correctly
        assertEquals(
                1,
                quiz.getQuestions().get(0).getQuestionNumber(),
                "The question number of the first question should be 1"
        );
        assertEquals(
                2,
                quiz.getQuestions().get(1).getQuestionNumber(),
                "The question number of the second question should be 2"
        );
    }
}
