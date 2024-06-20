class Main02040601 {
    public static int simpleSummationOfSummations(int n) {
        if (n <= 0)
            return 0;
        return simpleSummation(n) + simpleSummationOfSummations(n - 1);
    }

    public static int simpleSummation(int n) {
        if (n <= 0)
            return 0;
        return n + simpleSummation(n - 1);
    }

    public static int simpleSummationOfSummationsNestedItereation(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                total += j;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(simpleSummationOfSummations(4));
        System.out.println(simpleSummationOfSummationsNestedItereation(4));
    }
}
