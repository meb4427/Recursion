class Main {
    public static void countUpToN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void printAllCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        countUpToN(15);
        printAllCharacters("Hello World!");
    }
}