package BT.BT02;


public class Rectangle {
    private double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println();
        System.out.println("Hình chữ nhật có chiều dài: " + height);
        System.out.println("Hình chữ nhật có chiều rộng: " + width);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
        System.out.println();
    }
}

