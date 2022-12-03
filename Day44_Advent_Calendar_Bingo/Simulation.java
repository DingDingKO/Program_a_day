package Day44_Advent_Calendar_Bingo;

public class Simulation {
    public int run() {
        Board board = new Board();

        for (int i = 0; i < 25; i++) {
            int randomIndex = (int) (Math.random() * 24 + 1);
//            board.toString();
            board.replace(randomIndex);
        }
//        System.out.println("Rows: " + board.countRows());
//        System.out.println("Columns: " + board.countColumns());
        return board.countRows() + board.countColumns();
    }
}
