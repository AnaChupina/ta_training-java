package com.epam.training.student_anastasia_chupina.tenth.catch_em_all;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException e2){
            throw new IllegalArgumentException("Resource is missing", e2);
        } catch (IOException e) {
            throw new IllegalArgumentException("Resource error", e);
        } catch (ArithmeticException | NumberFormatException e3) {
            System.err.println(e3.getMessage());
        }
    }
}