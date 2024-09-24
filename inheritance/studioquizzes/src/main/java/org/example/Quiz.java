package org.example;

import java.util.ArrayList;

public class Quiz {

    private String questionsMC = "Which is an incorrect Java Datatype?";

    private ArrayList<String> answersMC = new ArrayList<>();
        answersMC.add("Strings");
        answersMC.add("HashMap");
        answersMC.add("Threads");
        answersMC.add("Float");

    private String correctAnswerMC = "Threads";

    private MultipleChoice testMC = new MultipleChoice (questionsMC, answersMC, correctAnswerMC);

        testMC.displayQuestion();
        testMC.handleUserInput();
        testMC.isCorrect();
}
