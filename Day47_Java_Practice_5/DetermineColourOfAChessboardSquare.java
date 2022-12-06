package Day47_Java_Practice_5;

public class DetermineColourOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        String[] split = coordinates.split("");
        String oddBlack = "aceg";

        if (oddBlack.contains(split[0])) {
            return Integer.parseInt(split[1]) % 2 == 0;
        } else {
            return Integer.parseInt(split[1]) + 1 % 2 == 0;
        }
    }
}
