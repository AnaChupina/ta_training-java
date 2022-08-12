package com.epam.training.student_anastasia_chupina.sixth.limited;

public class DecrementingCarousel {
    int [] carousel;
    public int capacity;
    int i = 0;
    int runNumber = 0;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (runNumber == 0 && i<capacity && element > 0 ) {
            carousel [i] = element;
            i++; // i is index of an element
            return true;
        }else {
            return false;
        }
    }
    public CarouselRun run(){
        if (runNumber == 0){
            runNumber = 1;
            return new CarouselRun(carousel);
        } else {
            return null;
        }
    }
}
