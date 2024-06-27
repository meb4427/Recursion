class Main {
    public static void printIntArray(int intArr[]) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 20, 13, -12, 2, 5 };
        printIntArray(arr);

        int[] newArr = new int[6];
        printIntArray(newArr);

        for (int i = 0; i < arr.length; ++i) {
            newArr[i] = arr[i];
        }

        System.out.println("Printing the new copied array");
        printIntArray(newArr);

        newArr[5] = 3;
        printIntArray(newArr);
    }
}
