class Solution {
    public static int numberOfWay(int x) {
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        } else {
            return numberOfWay(x - 1) + numberOfWay(x - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfWay(1)); // --> 1
        System.out.println(numberOfWay(2)); // --> 2
        System.out.println(numberOfWay(3)); // --> 3
        System.out.println(numberOfWay(4)); // --> 5
        System.out.println(numberOfWay(5)); // --> 8
        System.out.println(numberOfWay(10)); // --> 89
        System.out.println(numberOfWay(12)); // --> 233
        System.out.println(numberOfWay(20)); // --> 10946
    }
}
