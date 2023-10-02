package BT.BT01;
import java.util.Iterator;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public void display() {
        System.out.println();
        System.out.println("Hình vuông có cạnh: " + side);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
        System.out.println();
    }

    @Override
    public void resize(double percent) {
        if(percent < 1 || percent > 100) {
            System.err.println("Không được vượt quá 1-100%");
        } else {
            System.out.println();
            System.out.printf("Kích thước cạnh hình trước khi thay đổi là: %.2f\n", side);
            System.out.println("---------------------------------------------------");
            System.out.printf("Kích thước cạnh sau khi thay đổi là: %.2f\n", side + side * percent / 100);
            System.out.println();
        }
    }
}
