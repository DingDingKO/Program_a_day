package Day70_Java_Practice_8;

public class JewelsandStones
{
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains("" + stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}