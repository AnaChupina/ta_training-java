package com.epam.training.student_anastasiia_chupina.second.electronic_watch;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = seconds/60-hours*60;
        seconds = seconds-hours*3600-minutes*60;
        hours = hours%24;
        String addZeroToMinutes = (minutes>=10) ? "":"0";
        String addZeroToSeconds = (seconds>=10) ? "":"0";
        System.out.println(hours + ":" + addZeroToMinutes + minutes + ":" + addZeroToSeconds + seconds);
    }
}
