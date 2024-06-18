class Solution {
    public static boolean isSameLocation(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            if (x1 == x2) {
                return true;
            } else {
                return false;
            }
        }
        return (x1 - x2) % (v2 - v1) == 0 && (x1 - x2) / (v2 - v1) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(isSameLocation(0, 0, 0, 0)); // true
        System.out.println(isSameLocation(0, 3, 5, 2)); // true
        System.out.println(isSameLocation(0, 2, 8, 2)); // false
        System.out.println(isSameLocation(0, 2, 8, 3)); // false
        System.out.println(isSameLocation(0, 5, 1000, 3)); // true
        System.out.println(isSameLocation(0, 5, 1000, 2)); // false
        System.out.println(isSameLocation(14, 4, 98, 2)); // true
        System.out.println(isSameLocation(42, 3, 94, 2)); // true
        System.out.println(isSameLocation(43, 5, 49, 3)); // true
        System.out.println(isSameLocation(3, 2, 0, 3)); // true
        System.out.println(isSameLocation(9, 2, 9, 7)); // true
    }
}
