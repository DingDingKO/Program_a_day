package com.Day3_Cards;

import java.util.ArrayList;

public class CardFactory {
    static final String[] names = {"Lakisha Benson", "Dewayne Hancock", "Leonor Francis", "Orville Liu", "Reva Holmes", "Misty Mclaughlin", "Ginger Davenport", "Otis Alvarez", "Marianne Velasquez", "Mandy Meyers", "Maritza Nicholson", "Deangelo Hinton", "Nestor Stevens", "Jude Mckee", "Serena Dyer", "Billie Levine", "King Kaufman", "Jordan Hensley", "Zane Esparza", "Morris James", "Cassie Brewer", "Jae Kidd", "Emmett Molina", "Demarcus Moss", "Margarita Harrison", "Monty Bowman", "Columbus Cobb", "Ester Dawson", "Rodolfo Gordon", "Rudolf Mueller", "Rico Hoover", "Joaquin Grant", "Adam Landry", "Elsa Sweeney", "Saul Cox", "Garth Chung", "Candy Greer", "Darrell York", "Louis Clark", "Barton Cohen", "Arden Swanson", "Lelia Jacobs", "Britney Santana", "Lela Hickman", "Nicky Sanders", "Tyrell Campbell", "Milford Munoz", "Lance Christensen", "Stacey Schultz", "Johnnie Newman"};

    public static ArrayList<Card> cardMaker() {
        ArrayList<Card> deck = new ArrayList<>(50);
        for (String name:names) {
            deck.add(new Card(name, (int) (Math.random() * 100), (int) (Math.random() * 850), (int) (Math.random() * 1000), (int) (Math.random() * 20), (int) (Math.random() * 24)));
        }
        return deck;
    }


}
