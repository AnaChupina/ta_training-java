package com.epam.training.student_anastasia_chupina.second;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int resultHours = (hours<24) ? hours:0;
        int minutes = seconds/60-hours*60;
        seconds = seconds-hours*3600-minutes*60;
        String addZeroToMinutes = (minutes>=10) ? "":"0";
        String addZeroToSeconds = (seconds>=10) ? "":"0";
        System.out.println(resultHours + ":" + addZeroToMinutes + minutes + ":" + addZeroToSeconds + seconds);
    }
}
