class Main020305 {
    public static int globalCounter = 0;

    public static void incrementGlobalCounter() {
        globalCounter++;
    }

    public static void changeGlobalCounter(int x) {
        globalCounter = x;
    }

    public static int square(int x) {
        changeGlobalCounter(-12);
        return x * x;
    }

    public static void main(String[] args) {
        incrementGlobalCounter();
        System.out.println(globalCounter);

        incrementGlobalCounter();
        System.out.println(globalCounter);

        incrementGlobalCounter();
        System.out.println(globalCounter);

        square(10);
        System.out.println(globalCounter);

        incrementGlobalCounter();
        System.out.println(globalCounter);
    }
}
