class Main {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int totalEven(int[] listOfInts) {
        int count = 0;
        for (int i = 0; i < listOfInts.length; i++) {
            if (isEven(listOfInts[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] arts) {
        int[] list1 = new int[] { 3, 43, 5, 4, 2, 100, 6 };
        System.out.println(totalEven(list1));
    }
}
