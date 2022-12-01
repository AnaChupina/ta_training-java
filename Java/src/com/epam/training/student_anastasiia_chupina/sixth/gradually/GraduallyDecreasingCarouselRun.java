package com.epam.training.student_anastasiia_chupina.sixth.gradually;

public class GraduallyDecreasingCarouselRun extends CarouselRun{
    int k = 0;

    public GraduallyDecreasingCarouselRun(int[] carousel) {
        super(carousel);
    }
    public int next() {
        if (isFinished()){
            return -1;
        }
        for (; ; j=(j+1)%carousel.length) {
            if (j == 0){
                k++;
            }
            if (carousel[j] != 0) {
                nextReturn = carousel[j];
                if (k > carousel[j]) {
                    carousel[j] = 0;
                    j = (j+1)%carousel.length;
                    return nextReturn;
                } else {
                    carousel[j] = carousel[j]-k;
                    j = (j+1)%carousel.length;
                    return nextReturn;
                }

            }
        }
    }
}
