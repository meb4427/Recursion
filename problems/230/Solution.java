class Solution {
    public static String reduceByFive(int num) {
        return reduceByFiveHelper(num, num, Integer.toString(num), false);
    }

    public static String reduceByFiveHelper(int num, int currentNum, String res, boolean isUp) {
        if (currentNum == num && isUp) {
            return res + "," + Integer.toString(currentNum);
        } else if (currentNum == num && !isUp) {
            return reduceByFiveHelper(num, currentNum - 5, Integer.toString(currentNum), false);
        } else if (!isUp && currentNum >= 0) {
            return reduceByFiveHelper(num, currentNum - 5, res + ',' + Integer.toString(currentNum), false);
        } else if (currentNum < 0) {
            return reduceByFiveHelper(num, currentNum + 5, res + ',' + Integer.toString(currentNum), true);
        } else {
            return reduceByFiveHelper(num, currentNum + 5, res + ',' + Integer.toString(currentNum), true);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.reduceByFive(16).equals("16,11,6,1,-4,1,6,11,16"));
        System.out.println(Solution.reduceByFive(9).equals("9,4,-1,4,9"));
        System.out.println(Solution.reduceByFive(2).equals("2,-3,2"));
        System.out.println(Solution.reduceByFive(0).equals("0,-5,0"));
        System.out.println(Solution.reduceByFive(22).equals("22,17,12,7,2,-3,2,7,12,17,22"));
    }
}
