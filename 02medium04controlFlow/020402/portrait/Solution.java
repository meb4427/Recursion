class Solution {
    public static String screenViewMode(int width, int height) {
        return (width >= height) ? "portrait" : "landscape";
    }

    public static void main(String[] args) {
        System.out.println(screenViewMode(200, 150)); // Expected: portrait
        System.out.println(screenViewMode(120, 100)); // Expected: portrait
        System.out.println(screenViewMode(50, 100)); // Expected: landscape
        System.out.println(screenViewMode(60, 60)); // Expected: landscape
    }
}
