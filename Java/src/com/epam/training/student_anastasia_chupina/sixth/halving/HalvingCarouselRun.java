package com.epam.training.student_anastasia_chupina.sixth.halving;

public class HalvingCarouselRun extends CarouselRun {
    public HalvingCarouselRun(int[] carousel) {
        super(carousel);
    }
    public int next() {
        if (isFinished()){
            return -1;
        }
        for (; ; j=(j+1)%carousel.length) {
            if (carousel[j] != 0) {
                nextReturn = carousel[j];
                carousel[j] = carousel[j]/2;
                j = (j+1)%carousel.length;
                return nextReturn;
            }
        }
    }
}
