package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static TreeMap<Integer, User> userMap = new TreeMap<Integer, User>();
    static TreeMap<Integer, Set<String>> usersIp = new TreeMap<Integer, Set<String>>();
    static TreeMap<String, Integer> serverLogs = new TreeMap<String, Integer>();

    public static void main(String[] args) {
        File serverLog = new File("server.log");
        File users = new File("users.db");

        try {
            Scanner scanner = new Scanner(users);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("ip;id;fio;address")) {
                    continue;
                }
                System.out.println(line);
                String[] parse = line.split(";");
                String ip = parse[0];
                int id = Integer.parseInt(parse[1]);
                String fio = parse[2];
                String address = parse[3];
                userMap.put(id, new User(id, fio, address));
                Set<String> setIp = usersIp.get(id);
                if (setIp == null) setIp = new TreeSet<>();
                setIp.add(ip);
                usersIp.put(id, setIp);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(serverLog);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String ip = line.split(":")[0];
                Integer count = serverLogs.get(ip);
                if (count == null) count = 0;
                count++;
                serverLogs.put(ip, count);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(serverLogs);
    }

    public static String max() {
        int max = 0;
        String key = "";
        for (Map.Entry<String, Integer> i : serverLogs.entrySet())  {
            if( max < i.getValue()) {
                max = i.getValue();
                key = i.getKey();
            }
        }
        return key;
    }
}