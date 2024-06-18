class Solution {
    public static int frogPosition(int leaves, int jumps, int start) {
        int position = start + jumps;
        if (position > leaves) {
            if (position % leaves == 0) {
                return leaves;
            } else {
                return position % leaves;
            }
        } else if (position < 0) {
            return (0 - (position / leaves - 1)) * leaves + position;
        } else {
            return position;
        }
    }

    public static void main(String[] args) {
        System.out.println(frogPosition(4, 3, 1)); // 4
        System.out.println(frogPosition(4, 6, 2)); // 4
        System.out.println(frogPosition(4, -3, 1)); // 2
        System.out.println(frogPosition(4, -5, 1)); // 4
        System.out.println(frogPosition(4, 7, 1)); // 4
        System.out.println(frogPosition(4, 7, 2)); // 1
        System.out.println(frogPosition(11, 25, 11)); // 3
        System.out.println(frogPosition(23, -90, 1)); // 3
        System.out.println(frogPosition(9, -4, 3)); // 8
        System.out.println(frogPosition(105, -3, 8)); // 5
    }
}
