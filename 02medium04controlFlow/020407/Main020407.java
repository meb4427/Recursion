class Main020407 {
    public static void countN(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static int summation(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    // 再帰を用いて，最大公約数を求めるメソッド
    public static int gcd(int x, int y) {
       if(x % y == 0) return y;
       return gcd(y, x % y);
    }

    // while文を用いて，最大公約数を求めるメソッド1
    public static int gcdWhileLoopIteration(int n1, int n2) {
        while (n1 % n2 != 0) {
            int temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }
        return n2;
    }

    // while文を用いて，最大公約数を求めるメソッド2
    public static int gcdWhileLoopIterationFlag(int n1, int n2) {
        boolean flag = false;
        while (!flag) {
            if (n1 % n2 == 0) flag = true;
            else {
                int temp = n1;
                n1 = n2;
                n2 = temp % n2;
            }
        }
        return n2;
    }

    // while文を用いて，最大公約数を求めるメソッド3
    public static int gcdWhileLoopIterationReturn(int n1, int n2) {
        while (true) {
            if (n1 % n2 == 0) return n2;
            else {
                int temp = n1;
                n1 = n2;
                n2 = temp % n2;
            }
        }
    }

    public static void main(String[] args) {
        countN(10);
        System.out.println(summation(100));
        System.out.println(gcd(44,242));
        System.out.println(gcdWhileLoopIteration(44,242));
        System.out.println(gcdWhileLoopIterationFlag(44,242));
        System.out.println(gcdWhileLoopIterationReturn(44,242));
    }
}