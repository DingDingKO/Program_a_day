package Day67_Pi_Maker;

public class PiMaker {
    public double makePi(int amountOfTrails) {
        CircleFilter circleFilter = new CircleFilter();
        RandomCoord randomCoord = new RandomCoord();

        double withinCircle = 0;

        for (int i = 0; i < amountOfTrails; i++) {
            double[] randCoord = randomCoord.randCoord();

            if (circleFilter.inCircle(randCoord)) {
                withinCircle += 1;
            }
        }
        return (withinCircle / amountOfTrails) * 4;
    }
}