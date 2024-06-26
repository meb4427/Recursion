class Solution {
    public static int getMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        System.out.println(getMaxIndex(new int[] { 2, 4, 3, 8, 11 }));
        System.out.println(getMaxIndex(new int[] { 1 }));
        System.out.println(getMaxIndex(new int[] { 21, 4, 436, 85, 182, 169 }));
    }
}
