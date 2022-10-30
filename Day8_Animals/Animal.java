package Day8_Animals;
/* Day 8:
* A Pokémon styled animal game where each animal has different attack/defend moves.
* It uses an abstract class for all the general methods/data fields, then each animal extends the animal class
* to implement its own attack and defend methods.
*
* I think I bit off more than I can chew with this one, so I'll split it into two for tomorrow.
* */

public abstract class Animal {

    String animalName;
    int health;
    int stamina;

    public Animal(String animalName) {
        this.animalName = animalName;
        this.health = (int) (Math.random() * 100) + 100;
        this.stamina = (int) (Math.random() * 70) + 50;
    }

    public void rest() {
        System.out.println("The " + animalName + " has rested");
        stamina += 20;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract int attack();

    public abstract int defend(int damage);

    public int getStamina() {
        return stamina;
    }
}
