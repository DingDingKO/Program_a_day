package Day8_Animals;

import java.util.Random;

public class Elephant extends Animal{
    public Elephant() {
        super("Elephant");
    }

    @Override
    public int attack() {
        System.out.println("The elephant has trampled");
        stamina -= 30;
        return -30;
    }

    @Override
    public int defend(int damage) {
        System.out.println("The elephant had defended");
        if (Math.random() * 10 > 7) {
            return damage;
        } else {
            return 0;
        }
    }
}
