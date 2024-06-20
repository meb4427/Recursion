class Main02040802 {
    public static String luckyDigitRange(long number, int luckyDigit) {
        int perfectCounter = 0;
        int closeCounter = 0;
        int closeEnoughCounter = 0;

        String message = "Let's see how well our digits match with " + luckyDigit + "....";

        while (number >= 1) {
            int currentDigit = (int) (number % 10);
            number = (long) Math.floor(number / 10);

            long distance = Math.abs(currentDigit - luckyDigit);

            if (distance > 2)
                continue;

            if (distance == 0)
                perfectCounter++;
            else if (distance == 1)
                closeCounter++;
            else
                closeEnoughCounter++;
        }

        return message + " Perfect digits: " + perfectCounter + " -Close: " + closeCounter + " -Close Enough: "
                + closeEnoughCounter;
    }

    public static void main(String[] args) {
        System.out.println(luckyDigitRange(575445677589L, 7));
    }
}