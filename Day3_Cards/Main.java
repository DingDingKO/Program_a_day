/* Day 3:
A small top trumps type game

* */
package com.Day3_Cards;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Card> cards = CardFactory.cardMaker();
    static final int cardSize = cards.size();

    private static void display(int playerNumber, int computerNumber) {

        if (playerNumber > computerNumber) {
            System.out.println(playerNumber + " beats " + computerNumber + " you win!");
        } else {
            System.out.println(computerNumber + " beats " +  playerNumber+ " you lose!");
        }

    }

    private static void game() {
        int indexPlayer = (int) (Math.random() * cardSize);
        int indexComputer = (int) (Math.random() * cardSize);
        Card playerCard = cards.get(indexPlayer);
        Card computerCard = cards.get(indexComputer);

        System.out.println(playerCard.getName() + " vs. " + computerCard.getName() + ":");
        System.out.println(playerCard.toString());

        while (true) {
            System.out.println("Combust (1), Credit(2), Giraffe (3), Speed(4), Triangle (5):");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    display(playerCard.getLikelyhoodToCombust(), computerCard.getLikelyhoodToCombust());
                    break;
                case 2:
                    display(playerCard.getCreditScore(), computerCard.getCreditScore());
                    break;
                case 3:
                    display(playerCard.getDistanceFromTheNearestGiraffe(), computerCard.getDistanceFromTheNearestGiraffe());
                    break;
                case 4:
                    display(playerCard.getRunningSpeedThroughTreacle(), computerCard.getRunningSpeedThroughTreacle());
                    break;
                case 5:
                    display(playerCard.getTimeSpentThinkingAboutTriangles(), computerCard.getTimeSpentThinkingAboutTriangles());
                    break;
                default:
                    System.out.println("Your input cannot be understood");
                    continue;

            }
            break;
        }

    }
    public static void main(String[] args) {

        while (true) {
            game();
            System.out.println("type q to quit");
            String string = scanner.nextLine();
            if (string.equals("q")) {
                break;
            }
        }


    }
}
