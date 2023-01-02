package Day74_Difference_Square.test;

import Day74_Difference_Square.Difference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testDiff {
    @Test
    public void diffBetweenValues() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, Difference.getDiff(new int[]{1, 1, 1, 1}));
        assertArrayEquals(new int[]{4, 3, 2, 9}, Difference.getDiff(new int[]{10, 6, 3, 1}));
        assertArrayEquals(new int[]{9, 7, 1, 3}, Difference.getDiff(new int[]{1, 10, 3, 4}));

    }
}
