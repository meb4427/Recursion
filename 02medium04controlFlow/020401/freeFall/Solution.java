class Solution {
    public static int fallingDistance(String planet, int time) {
        double gravity;

        switch (planet) {
            case "Earth":
                gravity = 9.8;
                break;
            case "Jupiter":
                gravity = 24.79;
                break;
            case "Mercury":
                gravity = 3.7;
                break;
            default:
                gravity = 0;
        }
        double ans = 0.5 * gravity * time * time * 0.000621371;
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(fallingDistance("Earth", 5000)); // Expected: 76117
        System.out.println(fallingDistance("Jupiter", 1000)); // Expected: 7701
        System.out.println(fallingDistance("Mercury", 4500)); // Expected: 23278
        System.out.println(fallingDistance("Pluto", 2000)); // Expected: 0
    }
}
