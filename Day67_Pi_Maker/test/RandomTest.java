package Day67_Pi_Maker.test;

import Day67_Pi_Maker.RandomCoord;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RandomTest {
    @Test
    public void randomCoord() {
        double[] coord = new RandomCoord().randCoord();
        assert (coord[0] >= 0 && coord[0] < 1 && coord[1] >= 0 && coord[1] < 1);
        Arrays.stream(coord).forEach(System.out::println);
    }
}
