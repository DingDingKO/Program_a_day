package Day67_Pi_Maker.test;

import Day67_Pi_Maker.CircleFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {
    @Test
    public void checkInsideCircle() {
        assertTrue(new CircleFilter().inCircle(new double[]{0,0}));
        assertTrue(new CircleFilter().inCircle(new double[]{0,0.5}));
        assertTrue(new CircleFilter().inCircle(new double[]{0.5,0}));
        assertTrue(new CircleFilter().inCircle(new double[]{0.2,0.5}));
        assertTrue(new CircleFilter().inCircle(new double[]{0.6,0.3}));
        assertTrue(new CircleFilter().inCircle(new double[]{0.707,0.707}));
    }

    @Test
    public void checkOutsideCircle() {
        assertFalse(new CircleFilter().inCircle(new double[]{1,1}));
        assertFalse(new CircleFilter().inCircle(new double[]{1,0}));
        assertFalse(new CircleFilter().inCircle(new double[]{0,1}));
        assertFalse(new CircleFilter().inCircle(new double[]{1,1}));
        assertFalse(new CircleFilter().inCircle(new double[]{0.9,0.5}));
        assertFalse(new CircleFilter().inCircle(new double[]{0.5,0.9}));
        assertFalse(new CircleFilter().inCircle(new double[]{0.708,0.708}));
    }
}
