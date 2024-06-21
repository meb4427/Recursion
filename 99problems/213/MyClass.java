class MyClass {
    public static void main(String[] args) {
        Dog goldenRetriever = new Dog("Golden Retriever", 60, 10);
        System.out.println(goldenRetriever.bark()); // Wooof! Wooof!
        System.out.println(goldenRetriever.calcHumanAge()); // 75

        Dog siberianHusky = new Dog("Siberian Husky", 55, 6);
        System.out.println(siberianHusky.bark()); // Wooof! Wooof!
        System.out.println(siberianHusky.calcHumanAge()); // 47

        Dog poodle = new Dog("poodle", 10, 1);
        System.out.println(poodle.bark()); // Yip! Yip!
        System.out.println(poodle.calcHumanAge()); // 12

        Dog shibaInu = new Dog("shibaInu", 35, 4);
        System.out.println(shibaInu.bark()); // Ruff! Ruff!
        System.out.println(shibaInu.calcHumanAge()); // 33
    }
}

class Dog {
    String name;
    int size;
    int age;

    public Dog(String name, int size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public String bark() {
        if (this.size >= 50)
            return "Wooof! Woof!";
        else if (this.size >= 20)
            return "Ruff! Ruff!";
        else
            return "Yip! Yip!";
    }

    public int calcHumanAge() {
        return 12 + (this.age - 1) * 7;
    }
}
