package Day45_Java_Practice_3;
/*Day 45:
* Yay! My first "faster than 100%" :)
* */

public class Aranging_Coins {
    public int arrangeCoins(int n) {
        if(n == 1){return 1;}
        return (int)((-1 + Math.sqrt(1 + 8*(long)n))/2);
    }

    public static void main(String[] args) {
        Aranging_Coins aranging_coins = new Aranging_Coins();
        System.out.println(aranging_coins.arrangeCoins(1804289383));
    }
}
