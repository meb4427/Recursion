class Solution {
    public static int kthElement(int n, int k) {
        // System.out.println("n: " + n + " k: " + k);
        if (n == 1) {
            return 0;
        } else if (k % 2 == 0) {
            if (kthElement(n-1, k/2) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (kthElement(n-1, (k+1)/2) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(kthElement(4,5));
        System.out.println(kthElement(2,1));
        System.out.println(kthElement(2,2));
        System.out.println(kthElement(4,6));
        System.out.println(kthElement(5,8));
        System.out.println(kthElement(7,31));
        System.out.println(kthElement(9,47));
        System.out.println(kthElement(9,102));
    }
}