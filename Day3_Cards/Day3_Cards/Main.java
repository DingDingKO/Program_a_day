/* Day 3:
A small top trumps type game

* */
package com.Day3_Cards;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Card> cards = CardFactory.cardMaker();
    static final int cardSize = cards.size();

    private static void display(int playerNumber, int computerNumber) {

        if (playerNumber > computerNumber) {
            System.out.println(playerNumber + " is higher than " + computerNumber + " you win!");
        } else if (playerNumber < computerNumber) {
            System.out.println(playerNumber + " is lower than " + computerNumber + " you lose!");
        } else {
            System.out.println(computerNumber + " is the same as " + playerNumber + " it's a draw!");
        }

    }

    private static void game() {
        int indexPlayer = (int) (Math.random() * cardSize);
        int indexComputer = (int) (Math.random() * cardSize);

        Card playerCard = cards.get(indexPlayer);
        Card computerCard = cards.get(indexComputer);

        int choice = 0;

        System.out.println(playerCard.getName() + " vs. " + computerCard.getName() + ":");
        System.out.println(playerCard.toString());

        while (true) {
            System.out.println("Combust (1), Credit (2), Giraffe - lowest wins (3), Speed(4), Triangle (5):");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Your input cannot be understood");
                continue;
            }
            finally {
                scanner.nextLine();
            }



            switch (choice) {
                case 1:
                    display(playerCard.getLikelyhoodToCombust(), computerCard.getLikelyhoodToCombust());
                    break;
                case 2:
                    display(playerCard.getCreditScore(), computerCard.getCreditScore());
                    break;
                case 3:
                    display(computerCard.getDistanceFromTheNearestGiraffe(), playerCard.getDistanceFromTheNearestGiraffe());
                    System.out.println("Because why would you want to be far away from a Giraffe?");
                    break;
                case 4:
                    display(playerCard.getRunningSpeedThroughTreacle(), computerCard.getRunningSpeedThroughTreacle());
                    break;
                case 5:
                    display(playerCard.getTimeSpentThinkingAboutTriangles(), computerCard.getTimeSpentThinkingAboutTriangles());
                    break;
                default:
                    System.out.println("There isn't a choice with that number");
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
