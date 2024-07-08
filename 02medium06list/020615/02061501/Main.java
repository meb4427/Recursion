class Animal {
    public String species;
    public double weightKg;
    public double heightM;
    public boolean predator;

    public Animal(String species, double weightKg, double heightM, boolean predator) {
        this.species = species;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.predator = predator;
    }

    public void domesticate() {
        this.predator = false;
    }

}

class Hunter {
    public String name;
    public int age;
    public double weightKg;
    public double heightM;
    public double strength;
    public double cageCubicMeters;

    public Hunter(String name, int age, double weightKg, double heightM, double strength, double cageCubicMeters) {
        this.name = name;
        this.age = age;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.strength = strength;
        this.cageCubicMeters = cageCubicMeters;
    }

    public boolean canCaptureAnimal(Animal animal) {
        if ((this.strengthKg() >= animal.weightKg && this.cageCubicMeters >= animal.heightM) && !animal.predator) {
            return true;
        } else {
            return false;
        }
    }

    public boolean attemptToDomesticate(Animal animal) {
        if (this.strengthKg() <= animal.weightKg * 2) {
            return false;
        } else {
            animal.domesticate();
            return true;
        }
    }

    public double strengthKg() {
        return this.weightKg * this.strength;
    }
}

class Main {
    public static void printHunter(Hunter hunter) {
        System.out.println("The hunter's name is: " + hunter.name + ". This hunter can carry: " + hunter.strengthKg()
                + "kg and has a cage " + hunter.cageCubicMeters + " cubic meters wide");
    }

    public static void printAnimal(Animal animal) {
        System.out.println("The animal species is: " + animal.species + ". It's weight is: " + animal.weightKg
                + "kg and its height is: " + animal.heightM + "m. "
                + ((animal.predator) ? "It is a predator!" : "It is a peaceful animal."));
    }

    public static void main(String[] args) {
        // 各動物
        Animal tiger1 = new Animal("Tiger", 290, 2.6, true);
        Animal bear1 = new Animal("Bear", 250, 2.8, true);
        Animal cat1 = new Animal("Cat", 40, 0.5, false);
        Animal cow1 = new Animal("Cow", 1134, 1.5, false);

        // 各ハンター
        Hunter hunternator = new Hunter("Hunternator", 30, 124.73, 1.85, 15, 3);
        Hunter hunterChild = new Hunter("Hunter Child Of The Small Giants", 10, 50, 1.2, 0.6, 1);

        // 関数の呼び出し
        printHunter(hunternator);
        printAnimal(tiger1);

        System.out.println("Can " + hunternator.name + " capture " + tiger1.species + "? The answer is..."
                + hunternator.canCaptureAnimal(tiger1));
        System.out.println("Will " + hunternator.name + " be able to domesticate the " + tiger1.species + "?"
                + " The answer is..." + hunternator.attemptToDomesticate(tiger1));

        printAnimal(tiger1);
        System.out.println("Can " + hunternator.name + " capture " + tiger1.species + "? The answer is..."
                + hunternator.canCaptureAnimal(tiger1));
    }
}
