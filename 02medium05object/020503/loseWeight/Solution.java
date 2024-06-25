class Solution {
    public static double calcWeightByExercise(String exercise, int minutes) {
        double afterWeight = 85.5 - caloriesBurnedPerMinute(exercise) * minutes / 7700;
        return Math.floor(afterWeight * 10) / 10;
    }

    public static double caloriesBurnedPerMinute(String exercise) {
        return returnMet(exercise) * 3.5 * 85.5 / 200.0;
    }

    public static double returnMet(String exercise) {
        switch (exercise) {
            case "running":
                return 8;
            case "walking":
                return 3;
            case "tennis":
                return 5;
            case "rope jump":
                return 9;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcWeightByExercise("running", 100));
        System.out.println(calcWeightByExercise("walking", 150));
        System.out.println(calcWeightByExercise("tennis", 120));
        System.out.println(calcWeightByExercise("rope jump", 30));
    }
}
