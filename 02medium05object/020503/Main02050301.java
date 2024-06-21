import java.time.LocalDate;

class Person {
    public String firstName;
    public String lastName;
    public double heightM;
    public double weightKg;
    public int birthYear;

    public Person(String firstName, String lastName, double heightM, double weightKg, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightM = heightM;
        this.weightKg = weightKg;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - this.birthYear;
    }

    public double getBMI() {
        double bmi = this.weightKg / (this.heightM * this.heightM);
        return Math.floor(bmi * 10) / 10;
    }

    public double eat(double gainedCalory) {
        this.weightKg += Math.floor(gainedCalory / 7700 * 10) / 10;
        return this.weightKg;
    }

    public double calcWeightByExercise(String exercise, int minutes) {
        double afterWeight = this.weightKg - caloriesBurnedPerMinute(exercise) * minutes / 7700;
        return Math.floor(afterWeight * 10) / 10;
    }

    public double hoursToLose1KgByExercise(String exercise) {
        double res = (7700 / caloriesBurnedPerMinute(exercise) / 60);
        return Math.floor(res * 10) / 10;
    }

    public double caloriesBurnedPerMinute(String exercise) {
        return returnMet(exercise) * 3.5 * this.weightKg / 200.0;
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
}

class Main {
    public static void main(String[] args) {
        Person sada = new Person("Sadanori", "Maeba", 1.79, 90.5, 1989);

        System.out.println(sada.getFullName());
        System.out.println(sada.getAge());
        System.out.println(sada.getBMI());
        System.out.println(sada.eat(7700));
    }
}
