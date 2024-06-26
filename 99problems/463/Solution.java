class Solution {
    public static int sumOfOddElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfOddElement(new int[] { 2, 4, 3, 8, 11 }));
        System.out.println(sumOfOddElement(new int[] { 1 }));
        System.out.println(sumOfOddElement(new int[] { 21, 4, 436, 85, 182, 169 }));
    }
}
