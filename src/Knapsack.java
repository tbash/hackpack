public class Knapsack {
    int index(int total, int[] values, int[] weights) {
        int[] best = new int[total+1];
        for(int i=0; i<values.length; i++) {
            for (int j=weights[i]; j<best.length; j++)
                best[j] = Math.max(best[j], best[j-weights[i]]+values[i]);
        }
        return best[best.length-1];
    }
}
