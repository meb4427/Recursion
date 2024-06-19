class Main02040501 {
    public static int summationForLoopIteration(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(summationForLoopIteration(100));
    }
}
