import java.util.StringJoiner;

class Solution {
    public static String perfectNumberList(int n) {
        StringJoiner result = new StringJoiner("-");
        for (int i = 2; i <= n; i++) {
            int sum = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j != i / j) {
                        sum += i / j;
                    }
                }
            }
            if (sum == i) {
                result.add(String.valueOf(i));
            }
        }
        return result.length() == 0 ? "none" : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(perfectNumberList(3));
        System.out.println(perfectNumberList(6));
        System.out.println(perfectNumberList(28));
        System.out.println(perfectNumberList(100));
        System.out.println(perfectNumberList(496));
        System.out.println(perfectNumberList(1000));
        System.out.println(perfectNumberList(10000));
    }
}
