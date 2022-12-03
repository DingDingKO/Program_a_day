package Day44_Advent_Calendar_Bingo;
/* Day 44:
* A program which simulates my idea to play bingo with an advent calendar to see the average amount of wins given that
* you open the window based on a random number (1,25) each day.
* */
public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();

        double totalWins = 0;
        int totalRuns = 100000;

        for (int i = 0; i < totalRuns; i++) {
            totalWins += simulation.run();
        }
        System.out.println(totalWins/totalRuns * 100 + "%");

    }
}