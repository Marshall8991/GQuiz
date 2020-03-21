package com.example.gquiz;

public class Question {

    private int questionResId;
    private boolean correctAnswer;

    public Question(int questionResId, boolean correctAnswer) {
        this.questionResId = questionResId;
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionResId() {
        return questionResId;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }
}
