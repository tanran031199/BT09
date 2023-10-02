package BT.BT02;


public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * r * Math.PI;
    }
    public void display() {
        System.out.println();
        System.out.println("Hình tròn có bán kính: " + r);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
        System.out.println();
    }
}
