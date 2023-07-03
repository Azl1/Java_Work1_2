package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MissedCalls {

    Scanner scanner = new Scanner(System.in);
    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall() {
            System.out.println("Введите номер пропущенного вызова");
            String phone = scanner.nextLine();
            missedCalls.put(LocalDateTime.now(), phone);
            System.out.println("Добавлен ");
    }

    void printMissedCall(){
        for (Map.Entry<LocalDateTime, String> missedCall : missedCalls.entrySet()) {
            System.out.println(missedCall.getKey() + " " + missedCall.getValue());
        }
    }

    void clearMissedCall(){
        missedCalls.clear();
        System.out.println("Очищен ");
    }

    @Override
    public String toString() {
        return "MissedCalls{" +
                "missedCalls=" + missedCalls +
                '}';
    }
}
