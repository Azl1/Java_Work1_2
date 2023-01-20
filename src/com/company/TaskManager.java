package com.company;

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название задачи и время на ее выполнение: ");
        String input = scanner.nextLine();
        int startPos1 = input.indexOf("начинается в");
        String startTimeString1 = input.substring(startPos1 +12, startPos1 + 15);
        startTimeString1 = startTimeString1.trim();
        int startTime1 = Integer.parseInt(startTimeString1);

        int startPos2 = input.indexOf("заканчивается в");
        String startTimeString2 = input.substring(startPos2 +15, startPos2 + 18);
        startTimeString2 = startTimeString2.trim();
        int startTime2 = Integer.parseInt(startTimeString2);

        int result = startTime2 - startTime1;

        if (result > 0) {
            System.out.println("На задачу потребуется: " + result +  " ч.");
        }
       else{
           System.out.println("Формат введенных данных неверный");
        }
    }
}
