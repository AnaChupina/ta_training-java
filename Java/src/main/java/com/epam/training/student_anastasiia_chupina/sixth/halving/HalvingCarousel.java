package com.epam.training.student_anastasiia_chupina.sixth.halving;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);

    }
    public CarouselRun run(){
        if (runNumber == 0){
            runNumber = 1;
            return new HalvingCarouselRun(carousel);
        } else {
            return null;
        }
    }
}
