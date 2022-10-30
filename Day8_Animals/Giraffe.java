package Day8_Animals;

public class Giraffe extends Animal{

    public Giraffe() {
        super("Giraffe");
    }
    @Override
    public int attack() {

        if (Math.random() > 0.5) {
            System.out.println("The giraffe has wacked you with its neck");
            stamina -= 15;
            return -(int)(Math.random() * 70);
        } else {
            System.out.println("The giraffe has kicked you");
            stamina -= 20;
            return -40;
        }
    }

    @Override
    public int defend(int damage) {
        System.out.println("The giraffe had defended");

        return ((int)(Math.random() * damage) - 10);


    }
}
