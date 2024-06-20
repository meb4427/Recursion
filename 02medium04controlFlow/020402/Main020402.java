class Main020402 {
    public static String isEven(int n) {
        return (n % 2 == 0) ? "The number " + n + " is even" : "The number " + n + " is odd";
    }

    public static void main(String[] args) {
        System.out.println(isEven(43));
        System.out.println(isEven(44));
        System.out.println(isEven(1023));
        System.out.println(isEven(9992));
    }
}
