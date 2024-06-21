class Vehicle {
    public static String engine = "Standard Engine";

    public String kart;
    public String tire;
    public String glider;

    public Vehicle(String kart, String tire, String glider) {
        this.kart = kart;
        this.tire = tire;
        this.glider = glider;
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Standard Car", "Leaf Tires", "Toy Glider");

        System.out.println(car1.kart);
        System.out.println(car1.tire);
        System.out.println(car1.glider);

        System.out.println(Vehicle.engine);
    }
}
