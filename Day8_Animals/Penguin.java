package Day8_Animals;

public class Penguin extends Animal {
    public Penguin() {
        super("Penguin");
    }
    @Override
    public int attack() {
        System.out.println("The penguin has pecked");
        stamina += 10;
        return -5;
    }

    @Override
    public int defend(int damage) {
        System.out.println("The penguin had defended");
        if (Math.random() * 10 > 9) {
            return damage;
        } else {
            System.out.println("The penguin had regenerated");
            return 40;
        }
    }
}
