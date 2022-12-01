package com.epam.training.student_anastasiia_chupina.sixth.limited;

public class CarouselWithLimitRun extends CarouselRun{
    int action = 1;
    int actionLimit;
    public CarouselWithLimitRun(int[] carousel, final int actionLimit) {
        super(carousel);
        this.actionLimit = actionLimit;
    }
    public int next() {
        if (isFinished()){
            return -1;
        }
        for (; ; j=(j+1)%carousel.length) {
            if (action <= actionLimit) {
                if (carousel[j] != 0) {
                    nextReturn = carousel[j];
                    carousel[j]--;
                    j = (j+1)%carousel.length;
                    action++;
                    return nextReturn;
                }
            }else {
                return -1;
            }

        }
    }
    public boolean isFinished() {
        if (action > actionLimit){
            return true;
        } else {
            for (int i = 0; i < carousel.length; i++) {
                if (carousel[i] != 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
