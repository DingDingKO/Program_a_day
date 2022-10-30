package Day_10_Animals_Continued;

import Day8_Animals.Animal;
import Day8_Animals.AnimalMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMaker {
    static Scanner scanner = new Scanner(System.in);
    private static int player1Damage = 0;

    private static int player2Damage = 0;

    public static void main(String[] args) {
        ArrayList<Animal> animalsArray = AnimalMaker.cardMaker();

        List<Animal> player1AnimalsArray = animalsArray.subList(0, 2);
        List<Animal> player2AnimalsArray = animalsArray.subList(2, 4);

        Animal player1Animal;
        Animal player2Animal;
        int player1AnimalIndex = 0;
        int player2AnimalIndex = 0;
        while (player2AnimalsArray.size() > player2AnimalIndex && player1AnimalsArray.size() > player1AnimalIndex) {

            player1Animal = player1AnimalsArray.get(player1AnimalIndex);
            player1Damage = playRound(player1Animal, 1,player2Damage);
            if (player1Animal.getHealth() <= 0) {
                System.out.println("\n Player 1's " + player1Animal.getAnimalName() + " is down!\n");
                player1AnimalIndex++;
            }

            player2Animal = player2AnimalsArray.get(player2AnimalIndex);
            player2Damage = playRound(player2Animal, 2,player1Damage);
            if (player2Animal.getHealth() <= 0) {
                System.out.println("\n Player 2's " + player2Animal.getAnimalName() + " is down!\n");

                player2AnimalIndex++;
            }
        }
        if (player1AnimalIndex == 2) {
            System.out.println("Player 1 won!");
        } else if(player2AnimalIndex == 2){
            System.out.println("Player 2 won!");
        }

    }

    private static int playRound(Animal playerAnimal, int playerNumber, int opponentDamage) {
        System.out.println("\nPlayer "+playerNumber+": " + playerAnimal.getAnimalName() + " Health: "+playerAnimal.getHealth()+" Stamina: "+playerAnimal.getStamina()+" Attack(1), Defend(2), Rest(3): ");
        int choice = scanner.nextInt();
        int playerDamage = 0;

        switch (choice) {
            case 1:
                if (playerAnimal.getStamina() > 0) {
                    playerDamage = playerAnimal.attack();
                }else {
                        System.out.println("\nYou are too tired to attack");
                    }
                break;

            case 2:
                opponentDamage = playerAnimal.defend(opponentDamage);
                break;
            case 3:
                playerAnimal.rest();
                break;
        }
        System.out.println(playerAnimal.getAnimalName()+" receives "+ (-opponentDamage) + " points of damage");
        System.out.println(playerAnimal.getAnimalName()+" deals "+ (-playerDamage) + " points of damage");
        System.out.println(playerAnimal.getAnimalName()+" has "+ playerAnimal.getStamina() + " stamina remaining");

        playerAnimal.setHealth(playerAnimal.getHealth() + opponentDamage);
        return playerDamage;
    }
}
