class Solution {
    public static double hoursToEmpty(double velocity, int fuelEconomy, int tankCapacity) {
        double res = (tankCapacity * fuelEconomy / velocity / 3600);
        return Math.floor(res * 10) / 10;
    }

    public static void main(String[] args) {
        System.out.println(hoursToEmpty(0.04, 98, 12));
        System.out.println(hoursToEmpty(0.057, 36, 12));
        System.out.println(hoursToEmpty(0.059, 11, 18));
        System.out.println(hoursToEmpty(0.08, 55, 14));
    }
}
