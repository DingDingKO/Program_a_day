package Day8_Animals;

public class Penguin extends Animal {
    public Penguin() {
        super("Penguin");
    }
    @Override
    public int attack() {
        System.out.println("The penguin has pecked");
        stamina -= 15;
        return -15;
    }

    @Override
    public int defend(int damage) {
        System.out.println("The penguin had defended");
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber > 9) {
            System.out.println("The penguin had regenerated");
            return 40;
        } else if (randomNumber > 7) {
            return (int) damage / 2;
        } else {
            return damage;
        }


    }
}
