package com.epam.training.student_anastasiia_chupina.sixth.gradually;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }
    public CarouselRun run(){
        if (runNumber == 0){
            runNumber = 1;
            return new GraduallyDecreasingCarouselRun(carousel);
        } else {
            return null;
        }
    }
}
