package Day74_Difference_Square.test;

import Day74_Difference_Square.DepthFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDepthFinder {
    @Test
    public void depthTest() {
        assertEquals(6, new DepthFinder().findDepth(new int[]{10, 6, 3, 1}, 1));
    }
}
