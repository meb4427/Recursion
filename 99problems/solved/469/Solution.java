import java.util.Arrays;

class Solution {
    public static int[] evenRange(int a, int b) {
        return java.util.stream.IntStream.rangeClosed(a, b)
                .filter(x -> x % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenRange(10, 20)));
        System.out.println(Arrays.toString(evenRange(1, 1)));
        System.out.println(Arrays.toString(evenRange(3, 29)));
    }
}