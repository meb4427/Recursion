class Rectangle {
    public int width;
    public int height;
    public String color;

    public Rectangle(int w, int h, String c) {
        this.width = w;
        this.height = h;
        this.color = c;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle square1 = new Rectangle(20, 20, "orange");
        System.out.println(square1.color);

        Rectangle rectangle1 = new Rectangle(20, 100, "blue");
        System.out.println(rectangle1.height);

        Rectangle rectangle2 = new Rectangle(46, 30, "purple");
        System.out.println(rectangle2.width);
    }
}