class Solution {
    public static int addEveryOtherElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addEveryOtherElement(new int[] { 34, 46, 45, 57 }));
        System.out.println(addEveryOtherElement(new int[] { 60, 45, 66, 75, 56, 32, 654, 45, 100 }));
        System.out.println(addEveryOtherElement(new int[] { 5, 10 }));
        System.out
                .println(addEveryOtherElement(new int[] { 120, 85, 45, 67, 54, 343, 57, 800, 88, 67, 56, 57, 68, 75 }));
        System.out.println(addEveryOtherElement(new int[] {}));
    }
}
