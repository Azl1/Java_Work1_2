package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    HashMap<String, List<Contact>> hashMap = new HashMap<>();
    List<String> groups = new ArrayList<>();
    Map<String, Contact> note = new HashMap<>();

    public void addGroup(String input) {
        System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
        groups.add(input);
    }

    public void toStringList() {
        System.out.println(groups.toString());
    }
}
