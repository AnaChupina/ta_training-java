package com.epam.training.student_anastasiia_chupina.sixth.limited;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testInheritance() {
        assertEquals(DecrementingCarousel.class, DecrementingCarouselWithLimitedRun.class.getSuperclass());
    }
}
