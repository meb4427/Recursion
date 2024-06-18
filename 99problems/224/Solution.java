class Solution {
    public static int product(int x, int y) {
        return productHelper(x, y, 0);
    }

    public static int productHelper(int x, int y, int total) {
        if (y == 0) {
            return total;
        } else if (y > 0) {
            return productHelper(x, y - 1, total + x);
        } else {
            return productHelper(x, y + 1, total - x);
        }
    }

    public static void main(String[] args) {
        System.out.println(product(5, 3)); // --> 15
        System.out.println(product(3, 5)); // --> 15
        System.out.println(product(5, -1)); // --> -5
        System.out.println(product(-9, 8)); // --> -72
        System.out.println(product(-10, -5)); // --> 50
        System.out.println(product(0, 2)); // --> 0
        System.out.println(product(-9, 0)); // --> 0
        System.out.println(product(0, 0)); // --> 0
    }
}