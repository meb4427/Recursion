class Solution {
    public static String reduceByFive(int num) {
        return reduceByFiveHelper(num, num, true, "");
    }

    private static String reduceByFiveHelper(int original, int current, boolean decreasing, String res) {
        // System.out.println(res);
        if (current == original && !decreasing) {
            res += "," + Integer.toString(current);
            return res.substring(1);
        }
        if (decreasing) {
            if (current < 0) {
                res += "," + Integer.toString(current);
                return reduceByFiveHelper(original, current + 5, false, res);
            } else {
                res += "," + Integer.toString(current);
                return reduceByFiveHelper(original, current - 5, true, res);
            }
        } else {
            res += "," + Integer.toString(current);
            return reduceByFiveHelper(original, current + 5, false, res);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.reduceByFive(16));
        System.out.println(Solution.reduceByFive(16).equals("16,11,6,1,-4,1,6,11,16"));
        System.out.println(Solution.reduceByFive(9));
        System.out.println(Solution.reduceByFive(9).equals("9,4,-1,4,9"));
        System.out.println(Solution.reduceByFive(2));
        System.out.println(Solution.reduceByFive(2).equals("2,-3,2"));
        System.out.println(Solution.reduceByFive(0));
        System.out.println(Solution.reduceByFive(0).equals("0,-5,0"));
        System.out.println(Solution.reduceByFive(22));
        System.out.println(Solution.reduceByFive(22).equals("22,17,12,7,2,-3,2,7,12,17,22"));
    }
}
