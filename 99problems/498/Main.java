class Animal {
    String species;
    double weightKg;
    double heightM;
    boolean predator;

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
    String name;
    double weightKg;
    double heightM;
    double strength;
    double cageCubicMeters;

    public Hunter(String name, double weightKg, double heightM, double strength, double cageCubicMeters) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.strength = strength;
        this.cageCubicMeters = cageCubicMeters;
    }

    public double strengthKg() {
        return this.strength * this.weightKg;
    }

    public boolean canCaptureAnimal(Animal animal) {
        return (this.strengthKg() >= animal.weightKg)
                && (this.cageCubicMeters >= animal.heightM)
                && !animal.predator;
    }

    public boolean attemptToDomesticate(Animal animal) {
        if (this.strengthKg() <= animal.weightKg * 2) {
            return false;
        } else {
            animal.domesticate();
            return true;
        }
    }
}

class MyClass {
    static Animal tiger = new Animal("Tiger", 290, 2.6, true);
    static Animal cow = new Animal("Cow", 1134, 1.5, false);
    static Animal snake = new Animal("Snake", 100, 1.2, true);
    static Animal cat = new Animal("Cat", 10, 0.5, false);
    static Hunter hunternator = new Hunter("Hunternator", 124.73, 1.85, 15, 3);

    static Animal[] animals = { tiger, cow, snake, cat };

    public static void main(String[] args) {
        for (Animal animal : animals) {
            if (hunternator.canCaptureAnimal(animal)) {
                System.out.println(animal.species);
            }
        }

        for (Animal animal : animals) {
            hunternator.attemptToDomesticate(animal);
        }

        for (Animal animal : animals) {
            if (hunternator.canCaptureAnimal(animal)) {
                System.out.println(animal.species);
            }
        }
    }
}
