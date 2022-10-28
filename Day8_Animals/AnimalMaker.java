package Day8_Animals;

import Day3_Cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalMaker {
    public static ArrayList<Animal> cardMaker() {
        ArrayList<Animal> deck = new ArrayList<>();
        deck.add(new Cheetah());
        deck.add(new Cheetah());
        deck.add(new Elephant());
        deck.add(new Elephant());
        deck.add(new Giraffe());
        deck.add(new Giraffe());
        deck.add(new Penguin());
        deck.add(new Penguin());

        Collections.shuffle(deck);

        return deck;
    }
}
