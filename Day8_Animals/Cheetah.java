package Day8_Animals;

public class Cheetah extends Animal{
    public Cheetah() {
        super("Cheetah");
    }

    @Override
    public int attack() {
        System.out.println("The cheetah has run you down");
        stamina -= 50;

        if (Math.random() * 10 > 7.5) {
            return -60;
        } else {
            return -10;
        }

    }

    @Override
    public int defend(int damage) {
        System.out.println("The cheetah had defended");
        if (Math.random() * 10 < 7) {
            return damage;
        } else {
            return 0;
        }
    }
}
