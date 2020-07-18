package com.example.jokesjavalib;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Joke {

    private static List<String> jokesList = Arrays.asList(
            "Why did the programmer go to have a meeting with his boss? He wanted arrays.",
            "what did the computer say on Halloween? BOOlean!",
            "There are only 10 types of people who understand this: those who do and those who do not.",
            "Why can’t exceptions play basketball? Because they always throw it out of bounds!",
            "Why did the computer scientist get caught breaking into the bank? His method was public.",
            "What did the programmer get to help with his oddly shaped injured leg? A curly brace"

    );

    public static String getAJoke(){
        Random random = new Random();

        return jokesList.get(random.nextInt(jokesList.size()));
    }

}