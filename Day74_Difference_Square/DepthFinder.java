package Day74_Difference_Square;

import java.util.Arrays;

public class DepthFinder {
    public int findDepth(int[] array, int depth) {

        int[] diff = Difference.getDiff(array);
        System.out.println(Arrays.toString(diff));

        if (diff[0] == 0 && diff[1] == 0 && diff[2] == 0 && diff[3] == 0) {
            return depth;
        } else {
            return findDepth(diff, ++depth);
        }
    }
}
