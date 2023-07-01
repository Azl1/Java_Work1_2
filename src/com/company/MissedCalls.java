package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(Contacts phone) {
        missedCalls.put(LocalDateTime.now(), String.valueOf(phone));
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
