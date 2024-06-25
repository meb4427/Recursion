class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point startPoint;
    Point endPoint;

    public double getLength() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
    }

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public boolean checkLength(double l) {
        return l % 1 != 0;
    }
}

class MyClass {
    public static void main(String[] args) {
        Point a = new Point(3, 1);
        Point b = new Point(3, 6);
        Line lineAB = new Line(a, b);
        System.out.println((int)lineAB.getLength());

        Point c = new Point(1, 3);
        Point d = new Point(6, 15);
        Line lineCD = new Line(c, d);
        System.out.println((int)lineCD.getLength());

        Point e = new Point(2, 3);
        Point f = new Point(6, 15);
        Line lineEF = new Line(e, f);
        double l = lineEF.getLength();
        System.out.println(lineEF.checkLength(l) ? l : (int)l);
    }
}
