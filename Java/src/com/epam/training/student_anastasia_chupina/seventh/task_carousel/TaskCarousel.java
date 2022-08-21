package com.epam.training.student_anastasia_chupina.seventh.task_carousel;
public class TaskCarousel {
    Task [] carousel;
    int indexOfAdd;
    int indexOfTask;
    public TaskCarousel(int capacity) {
        carousel = new Task[capacity];
    }
    public boolean addTask(Task task) {
        if (task == null) {
            return false;
        }
        if (task.isFinished()){
            return false;
        }
        if (isFull()) {
            return false;
        }
        while (carousel[indexOfAdd] != null) {
            indexOfAdd = (indexOfAdd+1)%carousel.length;
        }
        carousel [indexOfAdd] = task;
        return true;
    }
    public boolean execute() {
        if (carousel[indexOfTask] == null){
            if(isEmpty()){
                return false;
            }
            while (carousel[indexOfTask] == null) {
                indexOfTask = (indexOfTask+1)%carousel.length;
            }
        }
        if (!carousel[indexOfTask].isFinished()) {
            carousel[indexOfTask].execute();
            if (carousel[indexOfTask].isFinished()) {
                carousel[indexOfTask] = null;
            }
            indexOfTask = (indexOfTask+1)%carousel.length;
            return true;
        }
        return false;
    }
    public boolean isFull() {
        for (Task element:carousel) {
            if (element == null) {
                return false;
            }
        }
        return true;
    }
    public boolean isEmpty() {
        boolean i = true;
        for (Task element:carousel) {
            if (element != null) {
                i = false;
                break;
            }
        }
        return i;
    }
}