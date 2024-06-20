class Solution {
    public static int splitAndAdd(int digits) {
        int sum = 0;
        while (true) {
            if (digits < 1) return sum;
            sum += digits % 10;
            digits /= 10;
        }
    }

    public static void main(String[] args) {
        System.out.println("splitAndAdd(19) --> " + splitAndAdd(19));
        System.out.println("splitAndAdd(898) --> " + splitAndAdd(898));
        System.out.println("splitAndAdd(23387) --> " + splitAndAdd(23387));
        System.out.println("splitAndAdd(1066) --> " + splitAndAdd(1066));
        System.out.println("splitAndAdd(546125) --> " + splitAndAdd(546125));
    }
}
