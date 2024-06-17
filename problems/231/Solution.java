class Solution {
    public static int minTiles(int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        } else if (n % 2 == 0 && m % 2 == 0) {
            return minTiles(n / 2, m / 2);
        } else if (n % 2 == 1) {
            return minTiles(n - 1, m) + m;
        } else if (m % 2 == 1) {
            return minTiles(n, m - 1) + n;
        } else {
            return minTiles(n - 1, m - 1) + n + m - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(minTiles(10, 5));
        System.out.println(minTiles(100, 7));
        System.out.println(minTiles(55, 9));
        System.out.println(minTiles(73, 8));
        System.out.println(minTiles(3, 4));
        System.out.println(minTiles(10, 10));
    }
}
