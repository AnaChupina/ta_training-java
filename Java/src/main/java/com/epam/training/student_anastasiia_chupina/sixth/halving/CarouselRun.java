package com.epam.training.student_anastasiia_chupina.sixth.halving;

public class CarouselRun {
    int j=0;
    int nextReturn;
    int [] carousel;
    public CarouselRun(final int [] carousel) {
        this.carousel = carousel;
    }
    public int next() {
        if (isFinished()){
            return -1;
        }
        for (; ; j=(j+1)%carousel.length) {
            if (carousel[j] != 0) {
                nextReturn = carousel[j];
                carousel[j]--;
                j = (j+1)%carousel.length;
                return nextReturn;
            }
        }
    }

    public boolean isFinished() {
        for (int i = 0; i < carousel.length; i++) {
            if (carousel [i] != 0) {
                return false;
            }
        }
        return true;
    }
}
