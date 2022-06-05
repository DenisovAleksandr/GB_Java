package ru.gb.Denisov.level_2.HomeWork3;

import java.util.HashMap;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] words = new String[]{
                "Robot",
                "Human",
                "Cat",
                "Dog",
                "Horse",
                "Bird",
                "Robot",
                "Human",
                "Cat"
        };
//        System.out.println(differentElements(words));
        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov","89101112121");
        phonebook.add("Petrova","89101115421");
        phonebook.add("Ivanov","89103225421");
        phonebook.add("Ivanov","89101633621");
        phonebook.get("Ivanov");

    }
    public static HashMap differentElements(String[] words){
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if(!hashMap.containsKey(word)) {
                hashMap.put(word, 0);
            }
            hashMap.put(word,hashMap.get(word)+1);
        }
        return hashMap;
    }
}
