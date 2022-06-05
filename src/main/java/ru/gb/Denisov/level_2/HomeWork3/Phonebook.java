package ru.gb.Denisov.level_2.HomeWork3;

import java.util.HashMap;

public class Phonebook {
    private String number;
    private String surname;
    HashMap<String, String> phonebook = new HashMap<>();

    void add(String surname, String number) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, number);
        } else {
            phonebook.put(surname, phonebook.get(surname) + " " + number);
        }
    }
    void get (String surname){
        System.out.println(surname+": "+ phonebook.get(surname));
    }

}

