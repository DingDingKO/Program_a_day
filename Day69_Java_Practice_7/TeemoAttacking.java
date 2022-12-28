package Day69_Java_Practice_7;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int attackTime = 0;

        for(int i = 0; i < timeSeries.length - 1; i++){
            if(timeSeries[i+1] > timeSeries[i] + duration){
                attackTime += duration;
            }else{
                attackTime += timeSeries[i+1] - timeSeries[i];
            }
        }
        return attackTime + duration;
    }
}
