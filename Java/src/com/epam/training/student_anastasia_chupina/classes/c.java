package com.epam.training.student_anastasia_chupina.classes;

import java.util.Arrays;

public class Car {
    private static int numOfCars;
    //другие поля
    public Car() {
        numOfCars++;
    }
    //другие методы
    public static int getNumOfCars() {
        return numOfCars;
}
