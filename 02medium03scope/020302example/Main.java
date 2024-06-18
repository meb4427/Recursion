class A {
    public static int x = 3;
    public static int y = 10;

    public static int multiply(int x) {
        return x * y;
    }

    static class B {
        public static int x = 15;
        
        public static int multiply(int x) {
            return x * y;
        }
    }
}

class Main{
    public static void main(String[] args) {
        int x = 33;
        System.out.println(x);
        System.out.println(A.x);
        System.out.println(A.multiply(5));
        System.out.println(A.B.x);
        System.out.println(A.B.multiply(2));
    }
}