class MyClass {
    public static void main(String[] args) {
        Animal rabbit = new Animal("rabbit", 10, 0.3, false, 20);
        System.out.println(rabbit.getBmi()); // 111.11
        System.out.println(rabbit.isDangerous()); // false

        Animal snake = new Animal("snake", 30, 1, true, 30);
        System.out.println(snake.isDangerous()); // true
        System.out.println(snake.getDailyCalories()); // 1076.76

        Animal elephant = new Animal("elephant", 300, 3, false, 5);
        System.out.println(elephant.getBmi()); // 33.33
        System.out.println(elephant.getDailyCalories()); // 6055.08

        Animal gazelle = new Animal("gazelle", 50, 1.5, false, 100);
        System.out.println(gazelle.getDailyCalories()); // 1579.45
        System.out.println(gazelle.isDangerous()); // true
    }
}

class Animal {
    static double activityMultiplier = 1.2;

    String name;
    double weightKg;
    double heightM;
    boolean isPredator;
    double speedKph;

    public Animal(String name, double weightKg, double heightM, boolean isPredator, double speedKph) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.isPredator = isPredator;
        this.speedKph = speedKph;
    }

    public double getBmi() {
        double bmi = this.weightKg / (this.heightM * this.heightM);
        return Math.floor(bmi * 100) / 100;
    }

    public double getDailyCalories() {
        double calories = 70 * Math.pow(this.weightKg, 0.75) * Animal.activityMultiplier;
        return Math.floor(calories * 100) / 100;
    }

    public boolean isDangerous() {
        if (isPredator)
            return true;
        else if (this.heightM > 1.7 || this.speedKph > 35)
            return true;
        else
            return false;
    }
}