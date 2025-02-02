package dynamic_programming;

public class Housecolor {
    public static int minCostToPaintHouses(int N, int[][] cost) {
        // Edge case: if there are no houses
        if (N == 0) return 0;

        // dp arrays to store the minimum cost to paint each house with red, blue, or green
        int[] dpRed = new int[N];
        int[] dpBlue = new int[N];
        int[] dpGreen = new int[N];

        // Initialize the first house costs
        dpRed[0] = cost[0][0];
        dpBlue[0] = cost[0][1];
        dpGreen[0] = cost[0][2];

        // Fill dp arrays for the remaining houses
        for (int i = 1; i < N; i++) {
            dpRed[i] = cost[i][0] + Math.min(dpBlue[i - 1], dpGreen[i - 1]);
            dpBlue[i] = cost[i][1] + Math.min(dpRed[i - 1], dpGreen[i - 1]);
            dpGreen[i] = cost[i][2] + Math.min(dpRed[i - 1], dpBlue[i - 1]);
        }

        // The result is the minimum cost to paint the last house in any color
        return Math.min(dpRed[N - 1], Math.min(dpBlue[N - 1], dpGreen[N - 1]));
    }

    public static void main(String[] args) {
        // Example 1
        int[][] cost1 = {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}};
        int N1 = 3;
        System.out.println("Minimum cost to paint all houses: " + minCostToPaintHouses(N1, cost1));

        // Example 2
        int[][] cost2 = {{1, 2, 3}, {1, 4, 6}};
        int N2 = 2;
        System.out.println("Minimum cost to paint all houses: " + minCostToPaintHouses(N2, cost2));
    }
}
