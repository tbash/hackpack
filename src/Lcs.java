public class Lcs {
    int index(String x, String y) {
        int i;
        int[][] table = new int[x.length()+1][y.length()+1];
        for (i=0; i<=x.length(); i++) table[i][0] = 0;
        for (i=0; i<=y.length(); i++) table[0][i] = 0;
        for (i = 1; i<=x.length(); i++) {
            for (int j = 1; j<=y.length(); j++) {
                if (x.charAt(i-1) == y.charAt(j-1)) table[i][j] = 1+table[i-1][j-1];
                else table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
            }
        }
        return table[x.length()][y.length()];
    }
}
