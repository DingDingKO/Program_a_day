package Day8_Animals;

public class Cheetah extends Animal{
    public Cheetah() {
        super("Cheetah");
    }

    @Override
    public int attack() {
        System.out.println("The cheetah has run you down");
        stamina -= 60;

        if (Math.random() * 10 > 7) {
            return -90;
        } else {
            return -20;
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
