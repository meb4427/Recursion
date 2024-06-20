class StaticMemoryClass {
    public static final double PI =3.14159265359;
}

class Main {
    public static double getPi() {
        double pi = 3.14159265359;
        return pi;
    }
    public static void main(String[] args) {
        System.out.println(StaticMemoryClass.PI);
        System.out.println(getPi());
    }
}
