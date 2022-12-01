package com.epam.training.student_anastasiia_chupina.sixth.limited;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    public int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }
    public CarouselWithLimitRun run(){
        if (runNumber == 0){
            runNumber = 1;
            return new CarouselWithLimitRun(carousel, actionLimit);
        } else {
            return null;
        }
    }
}
