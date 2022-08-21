package com.epam.training.student_anastasia_chupina.seventh.task_carousel;

public class CountDownTask implements Task{
    int countdownStart;
    public CountDownTask(int value) {
        countdownStart = Math.max(value, 0);
    }
    public int getValue() {
        return countdownStart;
    }

    @Override
    public void execute() {
        if (countdownStart != 0) {
            countdownStart--;
        }
    }
    @Override
    public boolean isFinished() {
        return countdownStart == 0;
    }
}

