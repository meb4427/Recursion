import java.util.Arrays;

class Solution {
    public static int[] minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            count += arr[i];
        }
        return new int[] { count - max, count - min };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minAndMax(new int[] { 5, 3, 2, 3, 4 })));
        System.out.println(Arrays.toString(minAndMax(new int[] { 5, 3 })));
        System.out.println(Arrays.toString(minAndMax(new int[] { 5, 0, 1 })));
        System.out.println(Arrays.toString(minAndMax(new int[] { 5, 5, 5, 5, 5 })));
        System.out.println(Arrays.toString(minAndMax(new int[] { 10, 80, 40, 60, 70 })));
        System.out.println(Arrays.toString(minAndMax(new int[] { 700, 500, 300, 900, 600, 80, 320, 780, 1000 })));
    }
}
