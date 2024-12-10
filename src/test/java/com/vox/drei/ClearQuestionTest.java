package com.vox.drei;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClearQuestionTest {
    @Test
    void clearQuestions() {
        // Setup: Create a quiz and add questions
        Quiz quiz = new Quiz("History Quiz", "History");
        Question question1 = new Question(
                "Who was the first President of the United States?",
                Arrays.asList(
                        "George Washington",
                        "Abraham Lincoln",
                        "Thomas Jefferson" ,
                        "John Adams"
                ),
                "George Washington", "MULTIPLE_CHOICE"
        );
        Question question2 = new Question(
                "In which year did World War II end?",
                Arrays.asList("1945", "1939", "1950" , "1940"),
                "1945", "MULTIPLE_CHOICE"
        );
        Question question3 = new Question(
                "Which empire was ruled by Genghis Khan?",
                Arrays.asList(
                        "Roman Empire",
                        "Mongol Empire",
                        "Ottoman Empire" ,
                        "British Empire"
                ),
                "Mongol Empire", "MULTIPLE_CHOICE"
        );

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        // Verify that questions are initially present
        assertEquals(
                3,
                quiz.getQuestions().size(),
                "Quiz should start with 3 questions"
        );

        // Action: Clear all questions
        quiz.clearQuestions();

        // Verify that the questions list is empty
        assertTrue(
                quiz.getQuestions().isEmpty(),
                "Quiz should have no questions after clearing"
        );
    }
}
