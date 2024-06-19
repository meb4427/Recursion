class Solution {
    public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest) {
        int years = 0;
        while (capitalMoney < goalMoney && years < 80) {
            capitalMoney += capitalMoney * interest / 100;

            if (years % 2 == 0) {
                goalMoney *= 1.02;
            } else {
                goalMoney *= 1.03;
            }
            years++;
        }
        return years >= 80 ? 80 : years;
    }

    public static void main(String[] args) {
        System.out.println(howLongToReachFundGoal(5421, 10421, 5)); // --> 27
        System.out.println(howLongToReachFundGoal(5421, 30, 30)); // --> 0
        System.out.println(howLongToReachFundGoal(600, 10400, 7)); // --> 67
        System.out.println(howLongToReachFundGoal(32555, 5200000, 12)); // --> 58
        System.out.println(howLongToReachFundGoal(50, 35000, 65)); // --> 14
        System.out.println(howLongToReachFundGoal(10, 350000, 2)); // --> 80
        System.out.println(howLongToReachFundGoal(20000, 10050000, 30)); // --> 27
    }
}
