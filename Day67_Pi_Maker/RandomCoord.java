package Day67_Pi_Maker;

import java.util.Random;

public class RandomCoord {
    public double[] randCoord() {
        Random random = new Random();
        return new double[]{random.nextDouble(), random.nextDouble()};
    }
}
