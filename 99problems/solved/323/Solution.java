class Solution {
    public static int sumOfDigits(int minute) {
        int total = 0;

        int hours = minute / 60;
        int hoursUnder12 = hours % 12;
        while (hoursUnder12 > 0) {
            total += hoursUnder12 % 10;
            hoursUnder12 /= 10;
        }

        int minutesUnder60 = minute % 60;
        while (minutesUnder60 > 0) {
            total += minutesUnder60 % 10;
            minutesUnder60 /= 10;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(180)); // 3
        System.out.println(sumOfDigits(623)); // 6
        System.out.println(sumOfDigits(10)); // 1
        System.out.println(sumOfDigits(390)); // 9
        System.out.println(sumOfDigits(1103)); // 11
        System.out.println(sumOfDigits(1439)); // 16
        System.out.println(sumOfDigits(6000)); // 4
        System.out.println(sumOfDigits(6208)); // 17
        System.out.println(sumOfDigits(7777)); // 19
        System.out.println(sumOfDigits(9999)); // 13
        System.out.println(sumOfDigits(10930)); // 3
    }
}
