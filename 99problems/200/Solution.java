class Solution {
    public static String fizzBuzz(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i > 1)
                result.append("-");

            if (i % 15 == 0)
                result.append("FizzBuzz");
            else if (i % 3 == 0)
                result.append("Fizz");
            else if (i % 5 == 0)
                result.append("Buzz");
            else
                result.append(String.valueOf(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(16));
        System.out.println(fizzBuzz(30));
    }
}
