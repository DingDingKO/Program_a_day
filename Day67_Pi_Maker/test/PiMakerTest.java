package Day67_Pi_Maker.test;

import Day67_Pi_Maker.PiMaker;
import org.junit.jupiter.api.Test;

public class PiMakerTest {
    @Test
    public void makePiTest() {
        int amountOfTrails = 100000;
        double calcPi = new PiMaker().makePi(amountOfTrails);
        System.out.println(calcPi);
        assert (Math.abs(calcPi - Math.PI) < 0.01);
    }

    @Test
    public void makePiTestAccuracy() {
        int amountOfTrails = 100000000;
        double calcPi = new PiMaker().makePi(amountOfTrails);
        System.out.println(calcPi);
        assert (Math.abs(calcPi - Math.PI) < 0.001);
    }
}
