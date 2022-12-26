package Day67_Pi_Maker;

public class CircleFilter {
    public boolean inCircle(double[] ints) {
        double x = ints[0];
        double y = ints[1];
        return Math.pow(x, 2) + Math.pow(y, 2) < 1;
    }
}
