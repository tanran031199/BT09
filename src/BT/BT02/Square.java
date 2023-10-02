package BT.BT02;

public class Square implements Colorable {
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
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
