import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String reduceByFive(int num) {
        List<Integer> result = new ArrayList<>();
        reduceByFiveHelper(num, num, true, result);
        return result.toString().replaceAll("[\\[\\] ]","");
    }

    public static void reduceByFiveHelper(int original, int current, boolean decreasing, List<Integer> res) {
        res.add(current);
        if (current == original && !decreasing) {
            return;
        }
        if (decreasing) {
            if (current < 0) {
                reduceByFiveHelper(original, current + 5,false, res);
            } else {
                reduceByFiveHelper(original, current - 5, true, res);
            }
        } else {
            reduceByFiveHelper(original, current + 5, false, res);
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
