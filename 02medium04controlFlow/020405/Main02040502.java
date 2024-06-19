class Main02040502 {
    public static int divideBy2CountIteration(int n) {
        int counter = 0;
        for (int temp = n; temp > 1; temp /= 2) {
            counter++;
        }
        return counter;
    }

    public static int divideByCountIteration(int divisor, int n) {
        int counter = 0;
        for (int temp = n; temp > 1; temp /= divisor) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(divideBy2CountIteration(64));
        System.out.println(divideByCountIteration(2, 64));
        System.out.println(divideByCountIteration(4, 64));
    }
}
