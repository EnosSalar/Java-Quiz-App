package com.vox.drei;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetQuestionByNumberTest {
    @Test
    void getQuestionByNumber(){
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

        // Test retrieving existing questions by their number
        assertEquals(question1, quiz.getQuestionByNumber(1), "Should return the first question for number 1");
        assertEquals(question2, quiz.getQuestionByNumber(2), "Should return the second question for number 2");
        assertEquals(question3, quiz.getQuestionByNumber(3), "Should return the third question for number 3");

        // Test retrieving a non-existent question number
        assertNull(quiz.getQuestionByNumber(4), "Should return null for non-existent question number");
    }
}
