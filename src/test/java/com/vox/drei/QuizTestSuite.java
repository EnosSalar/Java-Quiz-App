package com.vox.drei;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AddQuestionTest.class, RemoveQuestionTest.class , GetQuestionByNumberTest.class, ClearQuestionTest.class})
public class QuizTestSuite {
}
