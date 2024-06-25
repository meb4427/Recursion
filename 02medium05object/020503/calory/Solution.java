class Solution {
    public static double hoursToLose1KgByExercise(String exercise) {
        double res = (7700 / coloriesBurnedPerMinute(exercise) / 60);
        return Math.floor(res * 10) / 10;
    }

    public static double coloriesBurnedPerMinute(String exercise) {
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
        System.out.println("hoursToLose1KgByExercise(\"running\") --> " + hoursToLose1KgByExercise("running"));
        System.out.println("hoursToLose1KgByExercise(\"walking\") --> " + hoursToLose1KgByExercise("walking"));
        System.out.println("hoursToLose1KgByExercise(\"tennis\") --> " + hoursToLose1KgByExercise("tennis"));
        System.out.println("hoursToLose1KgByExercise(\"rope jump\") --> " + hoursToLose1KgByExercise("rope jump"));
    }
}
