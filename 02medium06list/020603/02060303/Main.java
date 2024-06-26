class Car {
    public String make;
    public String model;
    public int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    };
};

class Main {
    public static void printArray(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i].make + " - " + carArray[i].model + " -  " + carArray[i].year);
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Camry", 2000);
        cars[1] = new Car("BMW", "X1 Sports", 2019);
        cars[2] = new Car("Nissan", "GT-R", 2020);
        System.out.println("First model: " + cars[0].make + "-" + cars[0].model + " Year " + cars[0].year);

        // 関数を使ってすべての車を出力します。
        printArray(cars);
    }
}
