class Main020306 {
    public static void changeGlobalCounter(int x) {
        int counter = x;
    }

    public static int incrementOne(int x) {
        return x + 1;
    }

    public static int square(int x) {
        changeGlobalCounter(-12);
        return x * x;
    }

    public static int counterProcess() {
        int counter = 0;

        counter = incrementOne(counter);
        System.out.println(counter);

        counter = incrementOne(counter);
        System.out.println(counter);

        counter = incrementOne(counter);
        System.out.println(counter);

        square(10);

        counter = incrementOne(counter);
        System.out.println(counter);
    
        return counter;
    }

    public static void main(String[] args) {
        int finalCount = counterProcess();
        System.out.println(finalCount);
    }
}