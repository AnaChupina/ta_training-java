package com.epam.training.student_anastasiia_chupina.seventh.task_carousel;

public class CompleteByRequestTask implements Task {
    boolean completeCalled;
    boolean executeCalled;
    @Override
    public void execute() {
        if(completeCalled) {
            executeCalled = true;
        }
    }
    @Override
    public boolean isFinished() {
        return executeCalled;
    }
    public void complete() {
        completeCalled = true;
    }
}
