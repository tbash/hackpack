public class floyd_generic {

    static int oo = (int) 1e9;

    public static void main(String[] args){
        int[][] G;
        G = new int[][]{
                {0,1,2,3,4,25},
                {oo,0,6,7,8,9},
                {oo,oo,0,10,11,12},
                {oo,oo,oo,0,13,14},
                {oo,oo,oo,oo,0,15},
                {oo,oo,oo,oo,oo,0}
        };

        int[][] D;
        D = floyd(G);

        int s = 0;
        int e = 5;
        System.out.println("shortest path from "+s+" to "+e+" is "+D[s][e]);
    }

    public static int[][] floyd(int[][] G){
        int n = G[0].length;
        int[][] D = new int[n][n];
        for(int x = 0; x<n; x++){
            System.arraycopy(G[x], 0, D[x], 0, n);
        }

        for(int k = 0; k<n; k++){
            for(int x = 0; x<n; x++){
                for(int y = 0; y<n; y++){
                    if (D[x][k]+D[k][y] < D[x][y]) {
                        D[x][y] = D[x][k] + D[k][y];
                    }
                }
            }
        }
        return D;
    }
}
