import java.util.Arrays;

class Solution {
    public static int[] sortByMaxMin(int[] arr) {
        int[] result = new int[arr.length];
        arr = Arrays.stream(arr).sorted().toArray();

        int maxIndex = arr.length - 1;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[maxIndex--];
            } else {
                result[i] = arr[minIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByMaxMin(new int[] { 6, 2, 3, 5, 8, 4 })));
        System.out.println(Arrays.toString(sortByMaxMin(new int[] { 11, 15, 9, 7, 12 })));
        System.out.println(Arrays.toString(sortByMaxMin(new int[] { 85, 69, 56, 61, 78 })));
        System.out.println(Arrays.toString(sortByMaxMin(new int[] { 1, 2, 3 })));
    }
}
